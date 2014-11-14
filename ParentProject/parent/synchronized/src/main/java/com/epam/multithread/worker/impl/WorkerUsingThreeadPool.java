package com.epam.multithread.worker.impl;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.epam.multithread.domain.WorkerType;
import com.epam.multithread.worker.Worker;
import com.epam.multithread.worker.WorkerInterface;

public class WorkerUsingThreeadPool extends Worker implements WorkerInterface {

	public WorkerUsingThreeadPool() {
		super(WorkerType.USING_THREAD_POOL);
	}

	public void transferAmount() {
		Runnable runnable1=new Runnable() {

			public void run() {
				Random rand = new Random();

				for (int i = 0; i < 100000; i++) {
					doTransferAmount(rand.nextInt(1000));
				}

				System.out.println("Random Transfer Account1 to Account2 done");
			}

		};

		Runnable runnable2=new Runnable() {

			public void run() {
				Random rand = new Random();

				for (int i = 0; i < 100000; i++) {
					doTransferAmount(rand.nextInt(1000));
				}

				System.out.println("Random Transfer Account2 to Account1 done");
			}

		};

		System.out.println("\n*** Using Synchronized ***");
		System.out.println("Account1 balance:" + account1.getBalance());
		System.out.println("Account2 balance:" + account2.getBalance() + "\n");

		long startTime = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(runnable1);
		executor.submit(runnable2);
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		long endTime = System.currentTimeMillis();

		
		
		System.out.println("\nAccount1 balance:" + account1.getBalance());
		System.out.println("Account2 balance:" + account2.getBalance());
		System.out.println("Total balance:"
				+ (account1.getBalance() + account2.getBalance())
				+ ", Total Time Taken(ms):" + (endTime - startTime));
	}
	
	
	private void doTransferAmount(int amount){
		synchronized (this) {
			transferAmountAccount2ToAccount1(amount);
		}
	}

}

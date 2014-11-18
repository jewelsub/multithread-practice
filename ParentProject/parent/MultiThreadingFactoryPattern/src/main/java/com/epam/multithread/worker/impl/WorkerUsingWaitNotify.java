package com.epam.multithread.worker.impl;

import java.util.Random;

import com.epam.multithread.domain.WorkerType;
import com.epam.multithread.worker.AbstractWorker;
import com.epam.multithread.worker.WorkerInterface;

public class WorkerUsingWaitNotify extends AbstractWorker implements WorkerInterface {

	public WorkerUsingWaitNotify() {
		super(WorkerType.USING_WAIT_NOTIFY);
	}

	public void transferAmount() {

		Thread th1 = new Thread(new Runnable() {

			public void run() {
				Random rand = new Random();

				for (int i = 0; i < 100000; i++) {
					transferAmountAccount2ToAccount1(rand.nextInt(10));
				}
				
				try{
					notify();
				}catch(IllegalMonitorStateException er){
					System.out.println("th1 notify ex, "+er);
				}
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("th1 wait ex, "+e);
				}catch(IllegalMonitorStateException e33){
					System.out.println("th1 wait ex, "+e33);
				}

				System.out.println("th1 Random Transfer Account1 to Account2 done");

			
			}

		});

		Thread th2 = new Thread(new Runnable() {

			public void run() {
				try{
					notify();
				}catch(IllegalMonitorStateException er){
					System.out.println("th2 notify ex, "+er);
				}
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("th2 wait ex, "+e);
				}catch(IllegalMonitorStateException e33){
					System.out.println("th2 wait ex, "+e33);
				}
				Random rand = new Random();

				for (int i = 0; i < 100000; i++) {
					transferAmountAccount2ToAccount1(rand.nextInt(10));
				}

				System.out.println("th2 Random Transfer Account2 to Account1 done");
			}

		});

		System.out.println("\n*** Using Synchronized ***");
		System.out.println("Account1 balance:" + account1.getBalance());
		System.out.println("Account2 balance:" + account2.getBalance() + "\n");

		long startTime = System.currentTimeMillis();

		th1.start();
		th2.start();

		try {
			th1.join();	
			th2.join();
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

}

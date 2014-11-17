package com.epam.multithread.worker.impl;

import java.util.Random;

import com.epam.multithread.domain.WorkerType;
import com.epam.multithread.worker.AbstractWorker;
import com.epam.multithread.worker.WorkerInterface;

public class WorkerUsingLockObject extends AbstractWorker implements WorkerInterface {

	public WorkerUsingLockObject() {
		super(WorkerType.USING_LOCK_OBJECT);
	}

	public void transferAmount() {
		
		final Object lockObject = new Object();

		Thread th1 = new Thread(new Runnable() {

			public void run() {
				Random rand = new Random();

				for (int i = 0; i < 100000; i++) {

					synchronized (lockObject) {
						transferAmountAccount1ToAccount2(rand.nextInt(1000));
					}
				}

				System.out
						.println("Random Amount Transfer From Account1 to Account2 done");
			}

		});

		Thread th2 = new Thread(new Runnable() {

			public void run() {
				Random rand = new Random();

				for (int i = 0; i < 100000; i++) {
					synchronized (lockObject) {
						transferAmountAccount2ToAccount1(rand.nextInt(1000));
					}
				}

				System.out
						.println("Random Amount Transfer From Account2 to Account1 done");
			}

		});

		System.out.println("\n*** Using Lock Object ***");
		System.out.println("Account1 balance:" + account1.getBalance());
		System.out.println("Account2 balance:" + account2.getBalance() + "\n");

		long startTime= System.currentTimeMillis();
				
		th1.start();
		th2.start();

		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		long endTime= System.currentTimeMillis();

		System.out.println("\nAccount1 balance:" + account1.getBalance());
		System.out.println("Account2 balance:" + account2.getBalance());
		System.out.println("Total balance:"
				+ (account1.getBalance() + account2.getBalance())
				+ ", Total Time Taken(ms):"+(endTime-startTime));
	}

}

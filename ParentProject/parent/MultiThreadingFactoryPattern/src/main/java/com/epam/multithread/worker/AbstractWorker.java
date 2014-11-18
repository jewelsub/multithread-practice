package com.epam.multithread.worker;

import com.epam.multithread.domain.Account;
import com.epam.multithread.domain.WorkerType;

public abstract class AbstractWorker {
	
	protected WorkerType workerType;

	protected Account account1 = new Account(1001, 10000);
	protected Account account2 = new Account(1002, 10000);

	

	/**
	 * @param workerType
	 */
	public AbstractWorker(WorkerType workerType) {
		this.workerType = workerType;
	}

	protected void transferAmountAccount1ToAccount2(Integer amount) {
		account1.removeMount(amount);
		account2.addAmount(amount);
	}

	protected void transferAmountAccount2ToAccount1(Integer amount) {
		account2.removeMount(amount);
		account1.addAmount(amount);

	}

}
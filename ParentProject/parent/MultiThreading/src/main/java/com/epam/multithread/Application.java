/**
 * 
 */
package com.epam.multithread;

import com.epam.multithread.domain.WorkerType;
import com.epam.multithread.worker.WorkerFactiory;
import com.epam.multithread.worker.WorkerInterface;

/**
 * @author Mohammad_Masudur_Rahaman
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		runProcess();

	}

	private static void runProcess() {
		WorkerFactiory workerFactory = new WorkerFactiory();
		
		
		WorkerInterface worker1 = workerFactory.getWorkerByType(WorkerType.USING_LOCK_OBJECT);
		worker1.transferAmount();
		
		WorkerInterface worker2 = workerFactory.getWorkerByType(WorkerType.USING_SYNCHRONIZED);
		worker2.transferAmount();
		
		WorkerInterface worker3 = workerFactory.getWorkerByType(WorkerType.USING_THREAD_POOL);
		worker3.transferAmount();
		
		WorkerInterface worker4 = workerFactory.getWorkerByType(WorkerType.USING_REENTRANT_LOCK);
		worker4.transferAmount();
		
		//WorkerInterface worker4 = workerFactory.getWorkerByType(WorkerType.USING_WAIT_NOTIFY);
		//worker4.transferAmount();
	}

}

package com.epam.multithread.worker;

import com.epam.multithread.domain.WorkerType;
import com.epam.multithread.worker.impl.WorkerUsingLockObject;
import com.epam.multithread.worker.impl.WorkerUsingReentrantLock;
import com.epam.multithread.worker.impl.WorkerUsingSynchronized;
import com.epam.multithread.worker.impl.WorkerUsingThreeadPool;
import com.epam.multithread.worker.impl.WorkerUsingWaitNotify;

public class WorkerFactiory {
	
	public WorkerInterface getWorkerByType(WorkerType type){
		
		switch(type){
		
		case USING_LOCK_OBJECT:
			return new WorkerUsingLockObject();
		case USING_SYNCHRONIZED:
			return new WorkerUsingSynchronized();
		case USING_THREAD_POOL:
			return new WorkerUsingThreeadPool();
		case USING_WAIT_NOTIFY:
			return new WorkerUsingWaitNotify();
		case USING_REENTRANT_LOCK:
			return new WorkerUsingReentrantLock();
		default:
			return null;
		
		}
	}
}

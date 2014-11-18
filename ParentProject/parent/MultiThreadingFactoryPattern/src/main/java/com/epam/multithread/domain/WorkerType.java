package com.epam.multithread.domain;

public enum WorkerType {
	USING_LOCK_OBJECT,
	USING_SYNCHRONIZED,
	USING_THREAD_POOL,
	USING_WAIT_NOTIFY,
	USING_REENTRANT_LOCK
}

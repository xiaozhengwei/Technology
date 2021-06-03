package com.utunan.zk.distributedLock;


public interface Lock {

    boolean lock() throws Exception;

    boolean unlock();
}

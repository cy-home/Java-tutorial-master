package org.java.study.thread.chapter_four.section1.thread_1_12.project_lockTest1;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("公平锁情况："+lock.isFair());
        } finally {
            lock.unlock();
        }

    }
}

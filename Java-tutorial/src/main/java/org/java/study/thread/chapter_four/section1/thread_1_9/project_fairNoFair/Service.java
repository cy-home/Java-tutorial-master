package org.java.study.thread.chapter_four.section1.thread_1_9.project_fairNoFair;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock;
    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("threadName "+Thread.currentThread().getName()+" 获得锁定");
        } finally {
            lock.unlock();
        }
    }
}

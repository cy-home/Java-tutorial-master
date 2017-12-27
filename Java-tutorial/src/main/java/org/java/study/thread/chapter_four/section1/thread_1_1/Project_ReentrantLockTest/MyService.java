package org.java.study.thread.chapter_four.section1.thread_1_1.Project_ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("threadName="+Thread.currentThread().getName()+" i="+(i+1));
        }
        lock.unlock();
    }
}

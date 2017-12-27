package org.java.study.thread.chapter_four.section1.thread_1_2.project_conditionTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public void methodA(){
        try {
            lock.lock();
            String threadName = Thread.currentThread().getName();
            System.out.println("methodA begin threadName "+threadName+" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end threadName "+threadName+" time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try {
            lock.lock();
            String threadName = Thread.currentThread().getName();
            System.out.println("methodB begin threadName "+threadName+" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end threadName "+threadName+" time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

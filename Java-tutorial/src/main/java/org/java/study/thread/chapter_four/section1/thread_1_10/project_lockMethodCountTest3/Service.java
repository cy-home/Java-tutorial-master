package org.java.study.thread.chapter_four.section1.thread_1_10.project_lockMethodCountTest3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("begin 有"+lock.getWaitQueueLength(condition)+"个线程在等待Condition");
            condition.signal();
            System.out.println("end 有"+lock.getWaitQueueLength(condition)+"个线程在等待Condition");
        } finally {
            lock.unlock();
        }
    }
}

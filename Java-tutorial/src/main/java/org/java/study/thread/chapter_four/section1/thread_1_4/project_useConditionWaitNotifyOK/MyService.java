package org.java.study.thread.chapter_four.section1.thread_1_4.project_useConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println("await begin 时间为："+System.currentTimeMillis());
            condition.await();
            System.out.println("await end 时间为："+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("signal begin 时间为："+System.currentTimeMillis());
            condition.signal();
            System.out.println("signal end 时间为："+System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}

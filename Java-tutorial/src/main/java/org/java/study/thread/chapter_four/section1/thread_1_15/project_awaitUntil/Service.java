package org.java.study.thread.chapter_four.section1.thread_1_15.project_awaitUntil;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,10);
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" wait begin timer="+System.currentTimeMillis());
            condition.awaitUntil(calendar.getTime());
            System.out.println(Thread.currentThread().getName()+" wait end timer="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,10);
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" notify begin timer="+System.currentTimeMillis());
            condition.signalAll();
            System.out.println(Thread.currentThread().getName()+" notify end timer="+System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}

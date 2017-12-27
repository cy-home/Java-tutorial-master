package org.java.study.thread.chapter_four.section1.thread_1_5.project_mustUseMoreCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void awaitA(){
        try {
            lock.lock();
            String threadName = Thread.currentThread().getName();
            System.out.println("begin awaitA 时间为："+System.currentTimeMillis()+" threadName="+threadName);
            condition.await();
            System.out.println("end awaitA 时间为："+System.currentTimeMillis()+" threadName="+threadName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            String threadName = Thread.currentThread().getName();
            System.out.println("begin awaitB 时间为："+System.currentTimeMillis()+" threadName="+threadName);
            condition.await();
            System.out.println("end awaitB 时间为："+System.currentTimeMillis()+" threadName="+threadName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll(){
        try {
            lock.lock();
            System.out.println("signalAll 时间："+System.currentTimeMillis()+" threadName="+Thread.currentThread().getName());
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

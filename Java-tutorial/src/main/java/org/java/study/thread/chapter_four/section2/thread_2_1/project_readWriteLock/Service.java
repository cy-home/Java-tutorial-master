package org.java.study.thread.chapter_four.section2.thread_2_1.project_readWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        try {
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+" begin 获得读锁 "+System.currentTimeMillis());
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName()+" end 获得读锁 "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}

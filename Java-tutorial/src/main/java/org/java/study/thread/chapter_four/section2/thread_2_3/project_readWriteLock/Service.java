package org.java.study.thread.chapter_four.section2.thread_2_3.project_readWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        try {
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+" begin 获取读锁 "+System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" end 获取读锁 "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName()+" begin 获取写锁 "+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" end 获取写锁 "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}

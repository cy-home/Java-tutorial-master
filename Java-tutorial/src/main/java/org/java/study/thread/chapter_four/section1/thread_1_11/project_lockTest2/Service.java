package org.java.study.thread.chapter_four.section1.thread_1_11.project_lockTest2;

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
            System.out.println("有没有线程正在等待Condition？ "+lock.hasWaiters(condition)+" 线程数是多少？ "
                    +lock.getWaitQueueLength(condition));
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
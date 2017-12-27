package org.java.study.thread.chapter_four.section1.thread_1_13.project_lockTest1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lock();
            System.out.println("waitMethod begin "+Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE/10 ; i++) {
                Math.random();
            }
            System.out.println("waitMethod end "+Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}

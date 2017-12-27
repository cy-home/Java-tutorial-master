package org.java.study.thread.chapter_four.section1.thread_1_10.project_lockMethodCountTest1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("serviceMethod1 当前线程保持锁定的个数："+lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }

    }

    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println("serviceMethod2 当前线程保持锁定的个数："+lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}

package org.java.study.thread.chapter_four.section1.thread_1_13.project_lockTest3;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod(){
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+" 获得锁");
        }else{
            System.out.println(Thread.currentThread().getName()+" 没有获得锁");
        }
    }
}

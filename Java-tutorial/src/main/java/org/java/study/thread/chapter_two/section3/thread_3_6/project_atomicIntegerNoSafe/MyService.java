package org.java.study.thread.chapter_two.section3.thread_3_6.project_atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {

    public static AtomicLong aiRef = new AtomicLong();

    public void addNum(){
        System.out.println(Thread.currentThread().getName()+" 加了100之后的值："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
    public synchronized void addNumSynchronized(){
        System.out.println(Thread.currentThread().getName()+" 加了100之后的值："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}

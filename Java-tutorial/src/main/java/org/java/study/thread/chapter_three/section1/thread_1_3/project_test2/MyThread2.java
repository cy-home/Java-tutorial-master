package org.java.study.thread.chapter_three.section1.thread_1_3.project_test2;

public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock){
            System.out.println("begin notify "+System.currentTimeMillis());
            lock.notify();
            System.out.println("end notify "+System.currentTimeMillis());
        }
    }
}

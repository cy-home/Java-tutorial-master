package org.java.study.thread.chapter_three.section1.thread_1_3.project_test2;

public class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                System.out.println("begin wait "+System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

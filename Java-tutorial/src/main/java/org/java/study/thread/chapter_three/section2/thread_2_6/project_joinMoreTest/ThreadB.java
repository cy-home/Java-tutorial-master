package org.java.study.thread.chapter_three.section2.thread_2_6.project_joinMoreTest;

public class ThreadB extends Thread {

    @Override
    public synchronized void run() {
        super.run();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println("begin B threadName "+threadName+" "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end B threadName "+threadName+" "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

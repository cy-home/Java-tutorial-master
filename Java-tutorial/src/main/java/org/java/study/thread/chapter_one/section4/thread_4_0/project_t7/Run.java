package org.java.study.thread.chapter_one.section4.thread_4_0.project_t7;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin="+myThread.isAlive());
        myThread.start();

        Thread.sleep(1000);
        System.out.println("end="+myThread.isAlive());
    }
}

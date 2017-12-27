package org.java.study.thread.chapter_two.section2.thread_2_12.project_deadLockTest;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        //java多线程死锁
        DealThread dealThread = new DealThread();
        dealThread.setFlag("a");

        Thread t1 = new Thread(dealThread);
        t1.start();

        Thread.sleep(100);
        dealThread.setFlag("b");
        Thread t2 = new Thread(dealThread);
        t2.start();
    }
}

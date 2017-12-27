package org.java.study.thread.chapter_one.section7.thread_7_1.project_t11;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        //停止标记，并不能真正停止线程
        myThread.interrupt();
    }
}

package org.java.study.thread.chapter_one.section7.thread_7_8.project_useReturnInterrupt;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

    }
}

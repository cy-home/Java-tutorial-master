package org.java.study.thread.chapter_one.section10.thread_10_1.project_t18;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread1 run priority="+this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}

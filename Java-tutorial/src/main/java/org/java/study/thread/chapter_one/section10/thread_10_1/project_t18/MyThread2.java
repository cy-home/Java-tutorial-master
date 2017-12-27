package org.java.study.thread.chapter_one.section10.thread_10_1.project_t18;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread2 run priority="+this.getPriority());
    }
}

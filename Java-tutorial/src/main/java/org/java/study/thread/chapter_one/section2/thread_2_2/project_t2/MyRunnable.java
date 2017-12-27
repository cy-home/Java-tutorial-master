package org.java.study.thread.chapter_one.section2.thread_2_2.project_t2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" MyRunnable正在运行中...");
    }
}

package org.java.study.thread.chapter_one.section2.thread_2_3.project_t4;

public class MyThread extends Thread {

    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName()+" 计算，count="+count);
    }
}

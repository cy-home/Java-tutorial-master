package org.java.study.thread.chapter_one.section2.thread_2_4.project_sameNum;

/**
 * System.out.println();方法内部是线程安全的，有synchronized关键字
 */
public class MyThread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        System.out.println("i="+(count--)+" threadName="+Thread.currentThread().getName());
    }
}

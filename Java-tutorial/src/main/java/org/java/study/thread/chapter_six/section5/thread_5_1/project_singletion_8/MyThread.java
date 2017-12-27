package org.java.study.thread.chapter_six.section5.thread_5_1.project_singletion_8;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+" hashCode "+MyObject.getInstance().hashCode());
    }
}

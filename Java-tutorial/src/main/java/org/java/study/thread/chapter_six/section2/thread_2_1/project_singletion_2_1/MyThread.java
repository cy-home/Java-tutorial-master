package org.java.study.thread.chapter_six.section2.thread_2_1.project_singletion_2_1;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+" hashCode "+ MyObject.getInstance().hashCode());
    }
}

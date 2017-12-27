package org.java.study.thread.chapter_six.section3.thread_3_1.project_singletion_7;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+" hashCode "+MyObject.getInstance().hashCode());
    }
}

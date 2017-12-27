package org.java.study.thread.chapter_six.section1.thread_1_1.project_singletion_0;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+" hashCode "+MyObject.getInstance().hashCode());
    }
}

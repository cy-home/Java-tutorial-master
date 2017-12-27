package org.java.study.thread.chapter_two.section2.thread_2_9.project_synStaticMethod;

public class ThreadA extends Thread {

    @Override
    public void run() {
        super.run();
        Service.printA();
    }
}

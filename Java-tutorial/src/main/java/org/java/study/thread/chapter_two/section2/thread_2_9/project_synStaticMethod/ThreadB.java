package org.java.study.thread.chapter_two.section2.thread_2_9.project_synStaticMethod;

public class ThreadB extends Thread {

    @Override
    public void run() {
        super.run();
        Service.printB();
    }
}

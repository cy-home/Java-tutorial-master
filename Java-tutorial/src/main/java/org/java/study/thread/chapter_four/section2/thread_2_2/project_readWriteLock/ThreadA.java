package org.java.study.thread.chapter_four.section2.thread_2_2.project_readWriteLock;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.write();
    }
}

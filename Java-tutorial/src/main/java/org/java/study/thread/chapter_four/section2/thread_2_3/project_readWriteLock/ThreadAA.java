package org.java.study.thread.chapter_four.section2.thread_2_3.project_readWriteLock;

public class ThreadAA extends Thread {

    private Service service;

    public ThreadAA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.read();
    }
}

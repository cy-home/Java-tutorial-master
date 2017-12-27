package org.java.study.thread.chapter_two.section3.thread_3_7.project_syncUpdateNewValue;

public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.runMethod();
    }
}

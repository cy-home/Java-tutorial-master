package org.java.study.thread.chapter_two.section3.thread_3_7.project_syncUpdateNewValue;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.runMethod();
    }
}

package org.java.study.thread.chapter_two.section2.thread_2_5.project_doubleSynBlockOneTwo;

public class ThreadB extends Thread {

    private ObjectService service;

    public ThreadB(ObjectService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.serviceMethodB();
    }
}

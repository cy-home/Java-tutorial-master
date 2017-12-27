package org.java.study.thread.chapter_two.section2.thread_2_5.project_doubleSynBlockOneTwo;

public class ThreadA extends Thread {

    private ObjectService service;

    public ThreadA(ObjectService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.serviceMethodA();
    }
}

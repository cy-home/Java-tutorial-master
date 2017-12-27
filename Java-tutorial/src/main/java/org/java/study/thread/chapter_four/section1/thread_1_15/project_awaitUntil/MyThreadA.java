package org.java.study.thread.chapter_four.section1.thread_1_15.project_awaitUntil;

public class MyThreadA extends Thread {

    private Service service;

    public MyThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.waitMethod();
    }
}

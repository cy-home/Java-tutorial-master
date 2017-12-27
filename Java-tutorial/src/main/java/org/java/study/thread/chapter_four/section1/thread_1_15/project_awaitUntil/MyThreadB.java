package org.java.study.thread.chapter_four.section1.thread_1_15.project_awaitUntil;

public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.notifyMethod();
    }
}

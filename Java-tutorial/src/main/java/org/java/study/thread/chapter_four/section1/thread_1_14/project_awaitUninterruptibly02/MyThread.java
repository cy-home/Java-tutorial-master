package org.java.study.thread.chapter_four.section1.thread_1_14.project_awaitUninterruptibly02;

public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.testMethod();
    }
}

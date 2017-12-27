package org.java.study.thread.chapter_four.section1.thread_1_1.Project_ReentrantLockTest;

public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}

package org.java.study.thread.chapter_two.section1.thread_1_7.project_throwExceptionNoLock;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}

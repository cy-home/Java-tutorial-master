package org.java.study.thread.chapter_two.section2.thread_2_16.project_setNewStringTwoLock;

public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.testMethod();
    }
}

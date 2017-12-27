package org.java.study.thread.chapter_two.section2.thread_2_16.project_setNewStringTwoLock;

public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.testMethod();
    }
}

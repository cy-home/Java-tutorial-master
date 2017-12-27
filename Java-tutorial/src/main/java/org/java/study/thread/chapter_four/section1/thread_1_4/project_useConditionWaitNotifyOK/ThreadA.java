package org.java.study.thread.chapter_four.section1.thread_1_4.project_useConditionWaitNotifyOK;

public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.await();
    }
}

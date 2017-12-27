package org.java.study.thread.chapter_four.section1.thread_1_3.project_useConditionWaitNotifyError;

public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.await();
    }
}
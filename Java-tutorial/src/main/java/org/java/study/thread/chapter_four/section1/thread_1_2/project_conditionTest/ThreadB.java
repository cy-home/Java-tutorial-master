package org.java.study.thread.chapter_four.section1.thread_1_2.project_conditionTest;

public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
    }
}

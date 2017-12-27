package org.java.study.thread.chapter_four.section1.thread_1_2.project_conditionTest;

public class ThreadBB extends Thread {

    private MyService service;

    public ThreadBB(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
    }
}

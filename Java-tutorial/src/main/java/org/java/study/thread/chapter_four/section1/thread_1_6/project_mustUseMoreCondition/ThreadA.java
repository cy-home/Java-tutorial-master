package org.java.study.thread.chapter_four.section1.thread_1_6.project_mustUseMoreCondition;

public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.awaitA();
    }
}

package org.java.study.thread.chapter_four.section1.thread_1_5.project_mustUseMoreCondition;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.awaitB();
    }
}

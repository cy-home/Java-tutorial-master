package org.java.study.thread.chapter_two.section2.thread_2_9.project_synBlockMoreObjectOneLock;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.printA();
    }
}

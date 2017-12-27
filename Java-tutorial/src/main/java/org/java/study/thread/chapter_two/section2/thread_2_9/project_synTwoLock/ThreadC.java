package org.java.study.thread.chapter_two.section2.thread_2_9.project_synTwoLock;

public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.printC();
    }
}

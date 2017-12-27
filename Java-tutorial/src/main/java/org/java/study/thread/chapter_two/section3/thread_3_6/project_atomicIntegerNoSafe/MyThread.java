package org.java.study.thread.chapter_two.section3.thread_3_6.project_atomicIntegerNoSafe;

public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.addNum();
        //service.addNumSynchronized();
    }
}

package org.java.study.thread.chapter_two.section2.thread_2_2.project_synchronizedOneThreadIn;

public class ThreadB extends Thread {

    private ObjectService service;

    public ThreadB(ObjectService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}

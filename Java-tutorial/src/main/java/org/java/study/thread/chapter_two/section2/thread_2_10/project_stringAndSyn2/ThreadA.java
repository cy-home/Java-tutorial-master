package org.java.study.thread.chapter_two.section2.thread_2_10.project_stringAndSyn2;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.print(new Object());
    }
}

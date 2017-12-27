package org.java.study.thread.chapter_two.section2.thread_2_8.project_test2;

public class ThreadA extends Thread {

    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object){
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        this.service.testMethod1(this.object);
    }
}

package org.java.study.thread.chapter_three.section1.thread_1_4.project_waitReleaseLock;

public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.testMethod(lock);
    }
}

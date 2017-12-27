package org.java.study.thread.chapter_three.section1.thread_1_6.project_notifyOne;

public class ThreadC extends Thread {

    private Object lock;

    public ThreadC(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.testMethod(lock);
    }
}

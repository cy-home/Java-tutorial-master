package org.java.study.thread.chapter_three.section1.thread_1_4.project_notifyHoldLock;

public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
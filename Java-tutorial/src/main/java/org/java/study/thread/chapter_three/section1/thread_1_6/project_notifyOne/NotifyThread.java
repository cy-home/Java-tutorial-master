package org.java.study.thread.chapter_three.section1.thread_1_6.project_notifyOne;

public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock){
            System.out.println("执行notify");
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
        }
    }
}


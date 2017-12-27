package org.java.study.thread.chapter_three.section1.thread_1_7.project_notifyAll;

public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock){
            System.out.println("执行notifyAll");
            lock.notifyAll();
        }
    }
}


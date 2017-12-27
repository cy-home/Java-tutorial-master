package org.java.study.thread.chapter_three.section1.thread_1_4.project_notifyHoldLock;

public class Service {

    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin wait");
                lock.wait();
                System.out.println(Thread.currentThread().getName()+" end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin notify");
                lock.notify();
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName()+" end notify");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

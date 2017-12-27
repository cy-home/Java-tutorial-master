package org.java.study.thread.chapter_three.section1.thread_1_6.project_notifyOne;

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
}

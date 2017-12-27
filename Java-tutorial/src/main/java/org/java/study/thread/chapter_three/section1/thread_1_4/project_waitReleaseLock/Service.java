package org.java.study.thread.chapter_three.section1.thread_1_4.project_waitReleaseLock;

public class Service {

    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin wait");
                lock.wait();
                //Thread.sleep(   3000);
                System.out.println(Thread.currentThread().getName()+" end wait");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

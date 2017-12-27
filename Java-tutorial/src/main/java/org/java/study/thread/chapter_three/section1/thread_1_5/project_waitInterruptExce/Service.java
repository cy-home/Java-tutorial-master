package org.java.study.thread.chapter_three.section1.thread_1_5.project_waitInterruptExce;

public class Service {

    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait");
                lock.wait();
                System.out.println("end wait");
            }
        } catch (InterruptedException e) {
            System.out.println("出现异常了，因为在wait状态的线程被interrupt了");
            e.printStackTrace();
        }
    }
}

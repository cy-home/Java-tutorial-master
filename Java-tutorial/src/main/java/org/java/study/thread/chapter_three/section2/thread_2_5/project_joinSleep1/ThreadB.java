package org.java.study.thread.chapter_three.section2.thread_2_5.project_joinSleep1;

public class ThreadB extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("B run begin timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("B run end timer="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void bService(){
        System.out.println("打印了bService timer="+System.currentTimeMillis());
    }
}

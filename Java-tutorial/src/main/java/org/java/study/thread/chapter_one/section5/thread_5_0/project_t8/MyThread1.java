package org.java.study.thread.chapter_one.section5.thread_5_0.project_t8;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+" run() begin=="+System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" run() end=="+System.currentTimeMillis());
    }
}

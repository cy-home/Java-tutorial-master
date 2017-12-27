package org.java.study.thread.chapter_three.section2.thread_2_6.project_joinMoreTest;

public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b){
        this.b = b;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (b){
                String threadName = Thread.currentThread().getName();
                System.out.println("begin A threadName "+threadName+" "+System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end A threadName "+threadName+" "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

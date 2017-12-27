package org.java.study.thread.chapter_three.section2.thread_2_5.project_joinSleep1;

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
                b.start();
                Thread.sleep(6000);
                System.out.println("Thread.sleep(6000)后的代码");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package org.java.study.thread.chapter_three.section2.thread_2_3.project_joinException;

public class ThreadB extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end处打印了");
        } catch (InterruptedException e) {
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }
    }
}

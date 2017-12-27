package org.java.study.thread.chapter_three.section3.thread_3_2.project_threadLocalTest;

public class ThreadA extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadA"+(i+1));
                System.out.println("ThreadA get Value="+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

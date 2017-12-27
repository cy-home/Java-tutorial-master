package org.java.study.thread.chapter_one.section2.thread_2_1.project_z;

public class MyThread extends Thread {
    private int i;

    public MyThread(int i){
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("线程"+Thread.currentThread().getName()+"---i="+i);
    }
}

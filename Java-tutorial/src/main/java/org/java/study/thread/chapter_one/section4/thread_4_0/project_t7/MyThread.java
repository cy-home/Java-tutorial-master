package org.java.study.thread.chapter_one.section4.thread_4_0.project_t7;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("run()方法线程是否存活："+this.isAlive());
    }
}

package org.java.study.thread.chapter_one.sestion3.thread_3_0.project_t6;

public class MyThread extends Thread {

    public MyThread(){
        System.out.println("MyThread构造方法的打印："+Thread.currentThread().getName());
    }
    @Override
    public void run() {
        super.run();
        System.out.println("run()方法的打印："+Thread.currentThread().getName());
    }
}

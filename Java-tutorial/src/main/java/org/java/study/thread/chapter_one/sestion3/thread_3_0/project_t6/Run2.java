package org.java.study.thread.chapter_one.sestion3.thread_3_0.project_t6;

public class Run2 {
    public static void main(String[] args) {
        System.out.println("main方法的打印："+Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
        //myThread.run();
    }
}

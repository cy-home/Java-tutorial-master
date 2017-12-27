package org.java.study.thread.chapter_one.section5.thread_5_0.project_t8;

public class Run2 {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        System.out.println("begin "+System.currentTimeMillis());
        //异步执行
        thread.start();
        System.out.println("end "+System.currentTimeMillis());
    }
}

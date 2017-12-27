package org.java.study.thread.chapter_one.section5.thread_5_0.project_t8;

public class Run1 {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        System.out.println("begin "+System.currentTimeMillis());
        //同步执行
        thread.run();
        System.out.println("end "+System.currentTimeMillis());
    }
}

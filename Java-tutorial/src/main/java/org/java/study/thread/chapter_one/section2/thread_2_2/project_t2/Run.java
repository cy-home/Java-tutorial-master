package org.java.study.thread.chapter_one.section2.thread_2_2.project_t2;

public class Run {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("main函数执行完成...");
    }
}

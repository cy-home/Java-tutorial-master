package org.java.study.thread.chapter_one.section7.thread_7_6.project_stopcatch;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("main end...");
    }
}

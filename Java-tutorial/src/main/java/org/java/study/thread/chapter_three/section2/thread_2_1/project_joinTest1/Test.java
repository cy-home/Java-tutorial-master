package org.java.study.thread.chapter_three.section2.thread_2_1.project_joinTest1;

public class Test {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        //Thread.sleep(?);无法确定睡眠多久？
        System.out.println("我想等MyThread线程执行完了，才执行main线程？");
        System.out.println("要实现用join()");
    }
}

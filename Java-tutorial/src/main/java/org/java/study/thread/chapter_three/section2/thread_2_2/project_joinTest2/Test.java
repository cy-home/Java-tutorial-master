package org.java.study.thread.chapter_three.section2.thread_2_2.project_joinTest2;

public class Test {

    public static void main(String[] args) {
        try {
            MyThread t1 = new MyThread();
            t1.start();
            t1.join();
            System.out.println("我想等MyThread线程执行完了，才执行main线程，使用join()做到了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package org.java.study.thread.chapter_three.section2.thread_2_5.project_joinSleep1;

public class Run {

    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
            System.out.println("main end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package org.java.study.thread.chapter_one.section10.thread_10_4.project_countpriority;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.setPriority(Thread.NORM_PRIORITY - 3);
        a.start();

        ThreadB b = new ThreadB();
        b.setPriority(Thread.NORM_PRIORITY + 3);
        b.start();
        Thread.sleep(2000);

        a.stop();
        b.stop();

        System.out.println("a="+a.getCount());
        System.out.println("b="+b.getCount());
    }
}

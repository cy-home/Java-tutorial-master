package org.java.study.thread.chapter_three.section1.thread_1_7.project_notifyAll;

public class Test {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.setName("A");
            a.start();
            ThreadB b = new ThreadB(lock);
            b.setName("B");
            b.start();
            ThreadC c = new ThreadC(lock);
            c.setName("C");
            c.start();

            Thread.sleep(1000);
            NotifyThread nt = new NotifyThread(lock);
            nt.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

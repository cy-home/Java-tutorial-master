package org.java.study.thread.chapter_three.section1.thread_1_4.project_waitReleaseLock;

public class Test {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(lock);
        b.setName("B");
        b.start();
    }
}
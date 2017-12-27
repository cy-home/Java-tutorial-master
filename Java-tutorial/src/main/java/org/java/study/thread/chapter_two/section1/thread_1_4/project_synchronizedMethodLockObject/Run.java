package org.java.study.thread.chapter_two.section1.thread_1_4.project_synchronizedMethodLockObject;

public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(object);
        b.setName("B");
        b.start();
    }
}

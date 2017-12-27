package org.java.study.thread.chapter_two.section2.thread_2_9.project_synStaticMethod;

public class Run {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
}

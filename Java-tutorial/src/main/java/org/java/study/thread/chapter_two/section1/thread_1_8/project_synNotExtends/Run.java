package org.java.study.thread.chapter_two.section1.thread_1_8.project_synNotExtends;

public class Run {
    public static void main(String[] args) {
        Sub sub = new Sub();
        ThreadA a = new ThreadA(sub);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(sub);
        b.setName("B");
        b.start();
    }
}

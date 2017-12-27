package org.java.study.thread.chapter_two.section1.thread_1_2.project_t2;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum num = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(num);
        a.setName("ThreadA");
        a.start();
        ThreadB b = new ThreadB(num);
        b.setName("ThreadB");
        b.start();
    }
}

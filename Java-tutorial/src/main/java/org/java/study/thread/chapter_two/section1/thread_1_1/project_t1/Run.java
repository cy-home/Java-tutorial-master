package org.java.study.thread.chapter_two.section1.thread_1_1.project_t1;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum num = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(num);
        a.start();
        ThreadB b = new ThreadB(num);
        b.start();
    }
}

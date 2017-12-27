package org.java.study.thread.chapter_two.section1.thread_1_3.project_twoObjectTwoLock;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum num1 = new HasSelfPrivateNum();
        HasSelfPrivateNum num2 = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(num1);
        a.setName("ThreadA");
        a.start();

        ThreadB b = new ThreadB(num2);
        b.setName("ThreadB");
        b.start();
    }
}

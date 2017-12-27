package org.java.study.thread.chapter_four.section1.thread_1_3.project_z3OK;

public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}

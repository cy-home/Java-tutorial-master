package org.java.study.thread.chapter_four.section1.thread_1_7.project_conditionTest;

public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}

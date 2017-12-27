package org.java.study.thread.chapter_two.section2.thread_2_14.project_innerTest1;

import org.java.study.thread.chapter_two.section2.thread_2_14.project_innerTest1.OutClass.Inner;

public class Run {

    public static void main(String[] args) {
        final Inner inner = new Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }
}

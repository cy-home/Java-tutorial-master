package org.java.study.thread.chapter_two.section2.thread_2_15.project_innerTest2;

import org.java.study.thread.chapter_two.section2.thread_2_15.project_innerTest2.OutClass.InnerClass1;
import org.java.study.thread.chapter_two.section2.thread_2_15.project_innerTest2.OutClass.InnerClass2;


public class Run {

    public static void main(String[] args) {
        final InnerClass1 inner1 = new InnerClass1();
        final InnerClass2 inner2 = new InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner1.method1(inner2);
            }
        },"T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner1.method2();
            }
        },"T2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner2.method1();
            }
        },"T3");
        t1.start();
        t2.start();
        t3.start();
    }
}

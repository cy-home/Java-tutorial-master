package org.java.study.thread.chapter_two.section2.thread_2_8.project_test2;

public class MyObject {

    public synchronized void speedPrintString(){
        System.out.println("speedPrintString threadName "+Thread.currentThread().getName());
    }
}

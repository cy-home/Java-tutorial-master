package org.java.study.thread.chapter_two.section2.thread_2_8.project_test3;

public class MyObject {

    public void speedPrintString(){
        synchronized (this){
            System.out.println("speedPrintString threadName "+Thread.currentThread().getName());
        }
    }
}

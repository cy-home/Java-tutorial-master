package org.java.study.thread.chapter_two.section2.thread_2_4.project_t7;

public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("cynchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}

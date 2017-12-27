package org.java.study.thread.chapter_two.section2.thread_2_6.project_t8;

public class Task {

    public synchronized void otherMethod(){
        System.out.println("run otherMethod....");
    }

    public void doLongTimeTask(){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}

package org.java.study.thread.chapter_two.section2.thread_2_9.project_synTwoLock;

public class Service {

    public synchronized static void printA(){
        try {
            System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 进入printA");
            Thread.sleep(3000);
            System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void printB(){
        System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 进入printB");
        System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 离开printB");
    }

    public synchronized void printC(){
        System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 进入printC");
        System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 离开printC");
    }
}

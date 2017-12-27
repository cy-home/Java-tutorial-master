package org.java.study.thread.chapter_two.section2.thread_2_9.project_test;

public class Service {

    public void printA(){
        synchronized (Service.class){
            try {
                System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 进入printA");
                Thread.sleep(3000);
                System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 离开printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB(){
        synchronized (Service.class){
            System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 进入printB");
            System.out.println("threadName "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 离开printB");
        }
    }
}

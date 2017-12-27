package org.java.study.thread.chapter_two.section2.thread_2_8.project_test2;

public class Service {

    public void testMethod1(MyObject object){
        synchronized (object){
            try {
                System.out.println("testMethod1 begin time "+System.currentTimeMillis()+" run threadName "+Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1 end time "+System.currentTimeMillis()+" run threadName "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

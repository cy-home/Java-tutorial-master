package org.java.study.thread.chapter_two.section2.thread_2_16.project_setNewStringTwoLock;

public class MyService {

    private String lock = "123";

    public void testMethod(){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
                lock = "356";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

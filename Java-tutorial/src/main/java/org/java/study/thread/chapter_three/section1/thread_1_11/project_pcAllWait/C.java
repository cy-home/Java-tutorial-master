package org.java.study.thread.chapter_three.section1.thread_1_11.project_pcAllWait;

import java.sql.SQLOutput;

/**
 * 消费者
 */
public class C {

    private String lock;
    public C(String lock){
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                while (ValueObject.value.equals("")){
                    System.out.println("消费者 "+Thread.currentThread().getName()+" WAITING了");
                    lock.wait();
                }
                System.out.println("消费者 "+Thread.currentThread().getName()+" RUNNABLE了");
                ValueObject.value = "";
                //通知了同类线程，线程出现假死状态，换成notifyAll()即通知同类线程也通知异类线程
                //lock.notify();
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

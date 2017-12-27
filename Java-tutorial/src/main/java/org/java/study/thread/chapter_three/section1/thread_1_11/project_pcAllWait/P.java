package org.java.study.thread.chapter_three.section1.thread_1_11.project_pcAllWait;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 生产者
 */
public class P {

    private String lock;

    public P(String lock){
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println("生产者 "+Thread.currentThread().getName()+" WAITING了");
                    lock.wait();
                }
                System.out.println("生产者 "+Thread.currentThread().getName()+" RUNNABLE了");
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                ValueObject.value = value;
                //通知了同类线程，线程出现假死状态，换成notifyAll()即通知同类线程也通知异类线程
                //lock.notify();
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

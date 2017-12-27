package org.java.study.thread.chapter_three.section1.thread_1_10.project_waitOld;

public class Subtract {

    private String lock;

    public Subtract(String lock){
        this.lock = lock;
    }

    public void subtract(){
        try {
            synchronized (lock){
                if(ValueObject.list.size() == 0){
                    System.out.println("wait begin threadName "+Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end threadName "+Thread.currentThread().getName());
                }
                //ValueObject.list.remove(0);
                System.out.println("list size="+ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

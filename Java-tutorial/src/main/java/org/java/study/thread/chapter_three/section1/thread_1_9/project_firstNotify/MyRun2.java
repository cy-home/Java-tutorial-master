package org.java.study.thread.chapter_three.section1.thread_1_9.project_firstNotify;

import javafx.beans.binding.When;

public class MyRun2 {

    private String lock = new String("");
    private boolean isFirstRunB = false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock){
                    while (isFirstRunB == false){
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB =true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        //正常通知
        /*MyRun2 myRun = new MyRun2();
        Thread a = new Thread(myRun.runnableA);
        a.start();
        Thread.sleep(3000);
        Thread b = new Thread(myRun.runnableB);
        b.start();*/

        //通知过早，wait()永远不会被通知
        MyRun2 myRun = new MyRun2();
        Thread a = new Thread(myRun.runnableB);
        a.start();
        Thread.sleep(3000);
        Thread b = new Thread(myRun.runnableA);
        b.start();
    }
}

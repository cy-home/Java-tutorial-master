package org.java.study.thread.chapter_three.section1.thread_1_9.project_firstNotify;

public class MyRun {

    private String lock = new String("");
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock){
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
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
            }
        }
    };

    public static void main(String[] args) {
        //正常通知
        /*MyRun myRun = new MyRun();
        Thread a = new Thread(myRun.runnableA);
        a.start();
        Thread b = new Thread(myRun.runnableB);
        b.start();*/

        //通知过早，wait()永远不会被通知
        MyRun myRun = new MyRun();
        Thread a = new Thread(myRun.runnableB);
        a.start();
        Thread b = new Thread(myRun.runnableA);
        b.start();
    }
}

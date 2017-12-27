package org.java.study.thread.chapter_three.section1.thread_1_8.project_waitHasParamMethod;

public class MyRunnable {

    private static Object lock = new Object();
    private static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+" begin wait");
                    lock.wait(5000);
                    System.out.println("5秒之后唤醒...");
                    System.out.println(Thread.currentThread().getName()+" end wait");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private static Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin notify");
                lock.notify();
                System.out.println(Thread.currentThread().getName()+" end notify");
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(runnable1);
        t.start();
        Thread.sleep(3000);
        Thread t2 = new Thread(runnable2);
        t2.start();
    }

}

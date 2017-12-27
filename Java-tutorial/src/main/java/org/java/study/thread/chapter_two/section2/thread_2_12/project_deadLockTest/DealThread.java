package org.java.study.thread.chapter_two.section2.thread_2_12.project_deadLockTest;

public class DealThread implements Runnable {

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username){
        this.username = username;
    }

    @Override
    public void run() {
        if("a".equals(this.username)){
            synchronized (lock1){
                try {
                    System.out.println("username="+this.username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按lock1->lock2代码顺序执行了...");
                }
            }
        }
        if("b".equals(this.username)){
            synchronized (lock2){
                try {
                    System.out.println("username="+this.username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("按lock2->lock1代码顺序执行了...");
                }
            }
        }
    }
}

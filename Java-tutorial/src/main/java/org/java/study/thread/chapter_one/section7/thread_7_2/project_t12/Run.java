package org.java.study.thread.chapter_one.section7.thread_7_2.project_t12;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        //停止标记，并不能真正停止线程
        thread.interrupt();
        System.out.println("是否停止1："+thread.isInterrupted());
        System.out.println("是否停止2："+thread.isInterrupted());
        System.out.println("end...");
    }
}

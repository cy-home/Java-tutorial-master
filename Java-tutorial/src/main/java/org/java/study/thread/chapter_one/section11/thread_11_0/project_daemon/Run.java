package org.java.study.thread.chapter_one.section11.thread_11_0.project_daemon;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(5000);
        System.out.println("离开了thread对象也不再打印了，也就是停止了！");
    }
}

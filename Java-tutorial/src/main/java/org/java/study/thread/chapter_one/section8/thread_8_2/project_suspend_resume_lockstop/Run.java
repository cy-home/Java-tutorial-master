package org.java.study.thread.chapter_one.section8.thread_8_2.project_suspend_resume_lockstop;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(1000);
        thread.suspend();
        //所以System.out.println("main end...")这行代码迟迟不被执行
        System.out.println("main end...");
    }
}

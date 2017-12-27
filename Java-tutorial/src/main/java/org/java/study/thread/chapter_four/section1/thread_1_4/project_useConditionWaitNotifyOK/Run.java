package org.java.study.thread.chapter_four.section1.thread_1_4.project_useConditionWaitNotifyOK;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}

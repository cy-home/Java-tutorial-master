package org.java.study.thread.chapter_one.section2.thread_2_3.project_t4;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        System.out.println("main函数执行完成...");
    }
}

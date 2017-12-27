package org.java.study.thread.chapter_one.section2.thread_2_3.project_t3;

public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();
        System.out.println("main函数执行完成...");
    }
}

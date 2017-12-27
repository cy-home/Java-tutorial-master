package org.java.study.thread.chapter_two.section2.thread_2_6.project_t8;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        MyThread1 t1 = new MyThread1(task);
        t1.start();

        Thread.sleep(1000);
        MyThread2 t2 = new MyThread2(task);
        t2.start();
    }
}

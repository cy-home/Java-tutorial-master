package org.java.study.thread.chapter_two.section3.thread_3_5.project_AtomicIntegerTest;

public class Run {

    public static void main(String[] args) {
        AddCountThread count = new AddCountThread();
        Thread t1 = new Thread(count);
        t1.start();
        Thread t2 = new Thread(count);
        t2.start();
        Thread t3 = new Thread(count);
        t3.start();
        Thread t4 = new Thread(count);
        t4.start();
        Thread t5 = new Thread(count);
        t5.start();
    }
}

package org.java.study.thread.chapter_two.section2.thread_2_4.project_t7;

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        Thread1 t1 = new Thread1(task);
        t1.start();

        Thread2 t2 = new Thread2(task);
        t2.start();
    }
}

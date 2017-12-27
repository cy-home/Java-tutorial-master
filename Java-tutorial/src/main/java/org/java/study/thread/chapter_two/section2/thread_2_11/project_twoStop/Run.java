package org.java.study.thread.chapter_two.section2.thread_2_11.project_twoStop;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}

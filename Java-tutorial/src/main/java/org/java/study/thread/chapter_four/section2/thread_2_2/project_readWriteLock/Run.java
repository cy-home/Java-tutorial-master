package org.java.study.thread.chapter_four.section2.thread_2_2.project_readWriteLock;

public class Run {

    public static void main(String[] args) {

        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}

package org.java.study.thread.chapter_four.section2.thread_2_3.project_readWriteLock;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");

        ThreadB b = new ThreadB(service);
        b.setName("B");
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");

        a.start();
        aa.start();
        b.start();
        bb.start();
    }
}

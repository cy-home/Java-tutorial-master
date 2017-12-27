package org.java.study.thread.chapter_two.section2.thread_2_9.project_synMoreObjectStaticOneLock;

public class Run {

    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();

        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();
    }
}

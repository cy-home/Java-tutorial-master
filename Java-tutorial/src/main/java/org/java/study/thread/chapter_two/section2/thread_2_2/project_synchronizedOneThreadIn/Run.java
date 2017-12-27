package org.java.study.thread.chapter_two.section2.thread_2_2.project_synchronizedOneThreadIn;

public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}

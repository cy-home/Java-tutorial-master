package org.java.study.thread.chapter_two.section2.thread_2_8.project_test1;

public class Run1_1 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();

        ThreadA a = new ThreadA(service,object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("B");
        b.start();
    }
}

package org.java.study.thread.chapter_two.section2.thread_2_8.project_test1;

public class Run1_2 {

    public static void main(String[] args) {

        Service service = new Service();
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();

        ThreadA a = new ThreadA(service,obj1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service,obj2);
        b.setName("B");
        b.start();
    }
}

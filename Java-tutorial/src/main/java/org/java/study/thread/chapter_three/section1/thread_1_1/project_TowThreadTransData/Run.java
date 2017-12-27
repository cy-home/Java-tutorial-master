package org.java.study.thread.chapter_three.section1.thread_1_1.project_TowThreadTransData;

public class Run {

    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
    }
}

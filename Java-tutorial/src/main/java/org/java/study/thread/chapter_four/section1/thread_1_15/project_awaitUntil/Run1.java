package org.java.study.thread.chapter_four.section1.thread_1_15.project_awaitUntil;

public class Run1 {

    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA a = new MyThreadA(service);
        a.setName("Thread-A");
        a.start();
    }
}

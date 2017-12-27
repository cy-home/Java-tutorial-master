package org.java.study.thread.chapter_four.section1.thread_1_15.project_awaitUntil;

public class Run2 {

    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThreadA a = new MyThreadA(service);
            a.setName("Thread-A");
            a.start();
            Thread.sleep(2000);
            MyThreadB b = new MyThreadB(service);
            b.setName("Thread-B");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package org.java.study.thread.chapter_two.section2.thread_2_16.project_setNewStringTwoLock;

public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        Thread.sleep(50);
        b.start();
    }
}

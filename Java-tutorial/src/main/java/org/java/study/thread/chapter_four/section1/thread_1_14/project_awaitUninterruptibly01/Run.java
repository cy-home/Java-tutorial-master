package org.java.study.thread.chapter_four.section1.thread_1_14.project_awaitUninterruptibly01;

public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread thread = new MyThread(service);
            thread.start();
            Thread.sleep(3000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

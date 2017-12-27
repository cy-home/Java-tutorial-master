package org.java.study.thread.chapter_four.section1.thread_1_12.project_lockTest1;

public class Main {

    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();

        final Service service1  = new Service(false);
        runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        t1 = new Thread(runnable);
        t1.start();
    }
}

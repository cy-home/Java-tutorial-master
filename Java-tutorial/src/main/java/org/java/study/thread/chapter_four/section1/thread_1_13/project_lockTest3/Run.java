package org.java.study.thread.chapter_four.section1.thread_1_13.project_lockTest3;

public class Run {

    public static void main(String[] args) {
        final MyService service = new MyService();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();

        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}

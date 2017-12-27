package org.java.study.thread.chapter_three.section1.thread_1_10.project_waitOld;

public class Run {

    public static void main(String[] args) {
        try {
            String lock = new String("");
            Add add = new Add(lock);
            Subtract subtract = new Subtract(lock);

            ThreadSubtract ts1 = new ThreadSubtract(subtract);
            ts1.setName("ThreadSubtract1");
            ts1.start();
            ThreadSubtract ts2 = new ThreadSubtract(subtract);
            ts2.setName("ThreadSubtract2");
            ts2.start();
            Thread.sleep(1000);

            ThreadAdd threadAdd = new ThreadAdd(add);
            threadAdd.setName("threadAdd");
            threadAdd.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

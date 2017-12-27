package org.java.study.thread.chapter_three.section2.thread_2_3.project_joinException;

public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}

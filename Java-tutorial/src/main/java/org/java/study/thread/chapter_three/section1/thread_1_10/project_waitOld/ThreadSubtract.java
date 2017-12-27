package org.java.study.thread.chapter_three.section1.thread_1_10.project_waitOld;

public class ThreadSubtract extends Thread {

    private Subtract r;

    public ThreadSubtract(Subtract r){
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        r.subtract();
    }
}

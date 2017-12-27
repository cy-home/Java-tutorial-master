package org.java.study.thread.chapter_three.section1.thread_1_10.project_waitOld;

public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p){
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        p.add();
    }
}

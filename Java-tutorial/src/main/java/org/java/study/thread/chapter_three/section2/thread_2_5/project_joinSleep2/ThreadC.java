package org.java.study.thread.chapter_three.section2.thread_2_5.project_joinSleep2;

public class ThreadC extends Thread {

    private ThreadB b;
    public ThreadC(ThreadB b){
        this.b = b;
    }

    @Override
    public void run() {
        super.run();
        this.b.bService();
    }
}

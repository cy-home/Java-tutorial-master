package org.java.study.thread.chapter_two.section1.thread_1_1.project_t1;

public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadA( HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}

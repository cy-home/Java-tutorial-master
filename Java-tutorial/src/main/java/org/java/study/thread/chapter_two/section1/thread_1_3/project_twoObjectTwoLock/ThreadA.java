package org.java.study.thread.chapter_two.section1.thread_1_3.project_twoObjectTwoLock;

public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        this.numRef.addI("a");
    }
}

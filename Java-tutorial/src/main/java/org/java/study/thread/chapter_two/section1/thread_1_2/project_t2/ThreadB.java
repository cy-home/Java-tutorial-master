package org.java.study.thread.chapter_two.section1.thread_1_2.project_t2;

public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }
    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}

package org.java.study.thread.chapter_two.section1.thread_1_1.project_t1;

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

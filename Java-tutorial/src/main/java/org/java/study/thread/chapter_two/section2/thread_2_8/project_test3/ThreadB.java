package org.java.study.thread.chapter_two.section2.thread_2_8.project_test3;

public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        this.object.speedPrintString();
    }
}

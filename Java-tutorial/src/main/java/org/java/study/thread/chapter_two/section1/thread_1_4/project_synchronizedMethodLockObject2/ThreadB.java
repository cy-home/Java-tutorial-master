package org.java.study.thread.chapter_two.section1.thread_1_4.project_synchronizedMethodLockObject2;

public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}

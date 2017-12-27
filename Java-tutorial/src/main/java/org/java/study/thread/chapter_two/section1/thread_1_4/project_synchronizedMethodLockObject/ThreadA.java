package org.java.study.thread.chapter_two.section1.thread_1_4.project_synchronizedMethodLockObject;

public class ThreadA extends Thread {

    private MyObject object ;

    public ThreadA(MyObject object){
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}

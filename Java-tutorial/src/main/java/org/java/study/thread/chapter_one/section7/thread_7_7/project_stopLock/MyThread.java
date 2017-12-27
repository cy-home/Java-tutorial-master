package org.java.study.thread.chapter_one.section7.thread_7_7.project_stopLock;

public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.printString("b","bb");
    }
}

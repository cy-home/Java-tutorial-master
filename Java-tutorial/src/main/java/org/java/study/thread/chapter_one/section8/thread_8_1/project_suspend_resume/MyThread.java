package org.java.study.thread.chapter_one.section8.thread_8_1.project_suspend_resume;

public class MyThread extends Thread {

    private long i =0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            i++;
        }
    }
}

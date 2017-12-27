package org.java.study.thread.chapter_one.section10.thread_10_4.project_countpriority;

public class ThreadB extends Thread {

    private int count=0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            count++;
        }
    }
}

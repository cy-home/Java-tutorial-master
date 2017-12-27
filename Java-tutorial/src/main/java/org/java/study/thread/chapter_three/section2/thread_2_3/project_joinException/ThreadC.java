package org.java.study.thread.chapter_three.section2.thread_2_3.project_joinException;

import org.java.study.thread.chapter_three.section1.thread_1_10.project_waitOld.ThreadSubtract;

public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB){
        this.threadB = threadB;
    }

    @Override
    public void run() {
        super.run();
        threadB.interrupt();
    }
}

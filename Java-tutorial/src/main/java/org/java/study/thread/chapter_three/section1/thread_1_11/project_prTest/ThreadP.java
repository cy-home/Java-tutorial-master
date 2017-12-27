package org.java.study.thread.chapter_three.section1.thread_1_11.project_prTest;

/**
 * 生产者线程
 */
public class ThreadP extends Thread {

    private P p;
    public ThreadP(P p){
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            p.setValue();
        }
    }
}

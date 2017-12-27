package org.java.study.thread.chapter_three.section1.thread_1_11.project_prTest;

/**
 * 消费者线程
 */
public class ThreadC extends Thread {

    private C c ;

    public ThreadC(C c){
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            c.getValue();
        }
    }
}

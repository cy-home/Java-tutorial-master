package org.java.study.thread.chapter_two.section1.thread_1_8.project_synNotExtends;

public class ThreadB extends Thread {

    private Sub sub;
    public ThreadB(Sub sub){
        this.sub= sub;
    }
    @Override
    public void run() {
        super.run();
        sub.serviceMethod();
    }
}

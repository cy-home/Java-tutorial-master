package org.java.study.thread.chapter_two.section1.thread_1_5.project_t3;

public class ThreadA extends Thread {

    public PublicVar var ;

    public ThreadA(PublicVar var){
        this.var = var;
    }
    @Override
    public void run() {
        super.run();
        var.setValue("B","BB");
    }
}

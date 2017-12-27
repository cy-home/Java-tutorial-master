package org.java.study.thread.chapter_two.section2.thread_2_6.project_t8;

public class MyThread1 extends Thread {

    private Task task;

    public MyThread1(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        this.task.doLongTimeTask();
    }
}

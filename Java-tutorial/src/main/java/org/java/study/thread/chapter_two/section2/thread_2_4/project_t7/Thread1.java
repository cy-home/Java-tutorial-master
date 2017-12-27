package org.java.study.thread.chapter_two.section2.thread_2_4.project_t7;

public class Thread1 extends Thread {

    private Task task;

    public Thread1(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        this.task.doLongTimeTask();
    }
}

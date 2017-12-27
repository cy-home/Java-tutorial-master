package org.java.study.thread.chapter_two.section2.thread_2_6.project_t8;

public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        this.task.otherMethod();
    }
}

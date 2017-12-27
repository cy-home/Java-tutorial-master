package org.java.study.thread.chapter_two.section2.thread_2_3.project_t6;

public class MyThread1 extends Thread {

    private Task task;

    public MyThread1(Task task){
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}

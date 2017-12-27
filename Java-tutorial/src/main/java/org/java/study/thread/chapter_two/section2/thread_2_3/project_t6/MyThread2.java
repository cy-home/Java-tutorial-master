package org.java.study.thread.chapter_two.section2.thread_2_3.project_t6;

public class MyThread2 extends  Thread {

    private Task task;

    public MyThread2(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}

package org.java.study.thread.chapter_one.section9.thread_9_0.project_t17;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 500000; i++) {
            //Thread.yield();
            count += i+1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime)+"毫秒！");
    }
}

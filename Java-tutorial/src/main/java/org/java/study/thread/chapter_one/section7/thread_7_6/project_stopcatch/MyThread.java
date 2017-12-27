package org.java.study.thread.chapter_one.section7.thread_7_6.project_stopcatch;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run...");
            this.stop();
        }catch (Exception e){
            System.out.println("进入catch方法了!!!");
            e.printStackTrace();
        }
    }
}

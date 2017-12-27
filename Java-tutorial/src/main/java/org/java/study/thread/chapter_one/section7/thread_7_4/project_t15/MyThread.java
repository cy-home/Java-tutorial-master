package org.java.study.thread.chapter_one.section7.thread_7_4.project_t15;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i="+(i+1));
            }
            System.out.println("run() begin...");
            Thread.sleep(200000);
            System.out.println("run() end...");
        }catch (Exception e){
            System.out.println("在沉睡中被停止，进去catch！ isInterrupted="+this.isInterrupted());
            e.printStackTrace();
        }
    }
}

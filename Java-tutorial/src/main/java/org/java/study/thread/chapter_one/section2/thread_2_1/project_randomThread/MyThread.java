package org.java.study.thread.chapter_one.section2.thread_2_1.project_randomThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            for (int i = 0; i < 10; i++) {
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("正在运行线程："+Thread.currentThread().getName()+"---ID="+Thread.currentThread().getId());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

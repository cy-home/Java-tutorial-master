package org.java.study.thread.chapter_one.section2.thread_2_3.project_t3;

public class MyThread extends Thread {

    private int count = 5;
    public MyThread(String name){
        this.setName(name);//设置线程名称
    }
    @Override
    public void run() {
        super.run();
        while (count > 0 ){
            count--;
            System.out.println(Thread.currentThread().getName()+" 计算,count="+count);
        }
    }
}

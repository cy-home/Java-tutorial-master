package org.java.study.thread.chapter_one.section7.thread_7_8.project_useReturnInterrupt;

public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        while (true){
            if(this.isInterrupted()){
                System.out.println(this.getName()+" 停止了");
                return ;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }
}

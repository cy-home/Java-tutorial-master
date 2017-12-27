package org.java.study.thread.chapter_one.section7.thread_7_3.project_t13_1;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                //this.interrupted()测试当前状态是否已经是中断状态，执行后具有将状态标志清除为false的功能
                if(this.interrupted()){
                    System.out.println("已经是停止状态，我要退出线程了...");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("我在for代码块后面!");
        }catch (InterruptedException e){
            System.out.println("run()方法中的catch,可以做一些线程停止后的业务!");
            e.printStackTrace();
        }
    }
}

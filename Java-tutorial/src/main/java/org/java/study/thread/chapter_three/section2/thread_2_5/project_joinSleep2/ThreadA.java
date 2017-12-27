package org.java.study.thread.chapter_three.section2.thread_2_5.project_joinSleep2;

public class ThreadA extends Thread {

    private ThreadB b;
    public ThreadA(ThreadB b){
        this.b = b;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (b){
                b.start();
                b.join();//说明join释放锁了
                System.out.println("b.join()后的代码");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

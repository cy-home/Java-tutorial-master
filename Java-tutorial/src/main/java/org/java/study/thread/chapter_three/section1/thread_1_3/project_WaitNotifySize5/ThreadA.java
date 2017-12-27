package org.java.study.thread.chapter_three.section1.thread_1_3.project_WaitNotifySize5;

public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                if(MyList.size() !=5){
                    System.out.println("begin wait "+System.currentTimeMillis());
                    lock.wait();
                    System.out.println("end wait "+System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

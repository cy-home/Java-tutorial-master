package org.java.study.thread.chapter_three.section1.thread_1_3.project_WaitNotifySize5;


public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if(MyList.size() ==5 ){
                        lock.notify();
                        System.out.println("已发出通知了！");
                    }
                    System.out.println("添加了"+(i+1)+"个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package org.java.study.thread.chapter_three.section1.thread_1_1.project_TowThreadTransData;

public class ThreadA extends Thread {

    private MyList list ;

    public ThreadA(MyList list){
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println(Thread.currentThread().getName()+" 添加了"+(i+1)+"个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

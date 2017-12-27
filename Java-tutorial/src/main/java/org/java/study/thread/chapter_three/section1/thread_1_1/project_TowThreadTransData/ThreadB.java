package org.java.study.thread.chapter_three.section1.thread_1_1.project_TowThreadTransData;

public class ThreadB extends Thread {

    private MyList list ;

    public ThreadB(MyList list){
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (true){
                if(list.size() ==5){
                    System.out.println(Thread.currentThread().getName()+" i等于5了，B要退出线程了");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

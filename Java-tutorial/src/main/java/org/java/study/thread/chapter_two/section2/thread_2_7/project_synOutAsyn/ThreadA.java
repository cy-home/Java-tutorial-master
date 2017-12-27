package org.java.study.thread.chapter_two.section2.thread_2_7.project_synOutAsyn;

public class ThreadA extends Thread {

    private MyList list ;

    public ThreadA(MyList list){
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            list.add("threadA"+(i+1));
        }
    }
}

package org.java.study.thread.chapter_two.section2.thread_2_7.project_synOutAsyn;

public class ThreadB extends Thread {

    private MyList list ;

    public ThreadB(MyList list){
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            list.add("threadB"+(i+1));
        }
    }
}

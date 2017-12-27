package org.java.study.thread.chapter_two.section3.thread_3_3.project_t16;

public class RunThread extends Thread {

    private volatile boolean isRuning = true;

    public boolean isRuning() {
        return isRuning;
    }

    public void setRuning(boolean runing) {
        isRuning = runing;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("进入RunThread run ...");
        while (isRuning == true){
            //死循环
            //System.out.println("死循环...");
        }
        System.out.println("离开RunThread run ...");
    }
}

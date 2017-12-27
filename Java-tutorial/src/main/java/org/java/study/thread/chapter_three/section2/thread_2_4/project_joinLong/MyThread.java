package org.java.study.thread.chapter_three.section2.thread_2_4.project_joinLong;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin Timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("run end Timer="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

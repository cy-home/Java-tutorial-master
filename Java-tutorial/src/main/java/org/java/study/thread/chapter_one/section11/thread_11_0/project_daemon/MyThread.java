package org.java.study.thread.chapter_one.section11.thread_11_0.project_daemon;

public class MyThread extends Thread {
    private int i=0;

    @Override
    public void run() {
        super.run();
        try {
            while (true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

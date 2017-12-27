package org.java.study.thread.chapter_one.section7.thread_7_5.project_stop;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
            System.out.println("main end...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

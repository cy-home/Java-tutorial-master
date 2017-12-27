package org.java.study.thread.chapter_one.section7.thread_7_3.project_t13;

public class Run {
    public static void main(String[] args)  {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main end...");
    }
}

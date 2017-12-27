package org.java.study.thread.chapter_one.section7.thread_7_4.project_t15;

public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            thread.interrupt();
        }catch (Exception e){
            System.out.println("main catch!!");
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}

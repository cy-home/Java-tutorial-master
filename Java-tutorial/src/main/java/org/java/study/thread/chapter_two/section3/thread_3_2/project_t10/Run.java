package org.java.study.thread.chapter_two.section3.thread_3_2.project_t10;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        Thread.sleep(2000);
        //使用多线程，就停止了
        System.out.println("停止线程："+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}

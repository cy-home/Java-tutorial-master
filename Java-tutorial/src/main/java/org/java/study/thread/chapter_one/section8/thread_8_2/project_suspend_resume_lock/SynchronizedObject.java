package org.java.study.thread.chapter_one.section8.thread_8_2.project_suspend_resume_lock;

public class SynchronizedObject {

    synchronized public void printString(){
        System.out.println("begin...");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a 线程永远的suspend了！");
            //使用不当，极易造成公共同步锁对象的独占，使得其他线程无法访问公共同步对象
            Thread.currentThread().suspend();
        }
        System.out.println("end...");
    }
}

package org.java.study.thread.chapter_two.section3.thread_3_4.Project_volatileTestThread;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MyThread extends Thread {

    public static int count;

    private synchronized static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count="+count);
    }

    /*public volatile static int count;
    private static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count="+count);
    }*/
    @Override
    public void run() {
        super.run();
        addCount();
    }
}

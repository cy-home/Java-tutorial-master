package org.java.study.thread.chapter_two.section3.thread_3_3.project_t16;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Run {

    public static void main(String[] args) {
        try {
            RunThread rt = new RunThread();
            rt.start();
            Thread.sleep(1000);
            rt.setRuning(false);
            System.out.println("已经赋值为false了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

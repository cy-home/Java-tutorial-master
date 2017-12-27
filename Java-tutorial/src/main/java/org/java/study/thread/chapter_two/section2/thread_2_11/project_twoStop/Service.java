package org.java.study.thread.chapter_two.section2.thread_2_11.project_twoStop;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Service {

    public synchronized void methodA(){
        System.out.println("methodA begin...");
        boolean isContinueRun = true;
        while (isContinueRun){
            //此处是个死循环，导致锁一直释放不了，methodB()方法获取不到锁，没法运行
        }
        System.out.println("methodA end...");
    }

    public synchronized void methodB(){
        System.out.println("methodB begin...");
        System.out.println("methodB end...");
    }
}

package org.java.study.thread.chapter_two.section2.thread_2_7.project_synOutAsyn;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private List list = new ArrayList();

    public synchronized void add(String username){
        System.out.println("threadName "+Thread.currentThread().getName()+" begin execute add method...");
        list.add(username);
        System.out.println("threadName "+Thread.currentThread().getName()+" end execute add method...");
    }

    public synchronized int getSize(){
        System.out.println("threadName "+Thread.currentThread().getName()+" begin execute getSize method...");
        int sizeValue = list.size();
        System.out.println("threadName "+Thread.currentThread().getName()+" end execute getSize method...");
        return sizeValue;
    }
}

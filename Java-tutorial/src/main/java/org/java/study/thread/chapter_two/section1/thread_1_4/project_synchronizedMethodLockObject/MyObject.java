package org.java.study.thread.chapter_two.section1.thread_1_4.project_synchronizedMethodLockObject;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MyObject {
    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end methodA threadName="+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package org.java.study.thread.chapter_three.section1.thread_1_3.project_test1;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Test2 {

    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock){
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait后面的代码");
            }
            System.out.println("syn下面的代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

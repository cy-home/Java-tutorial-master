package org.java.study.thread.chapter_two.section1.thread_1_6.project_synLockIn_1;

public class Service {

    synchronized public void service1(){
        System.out.println("print service1...");
        service2();
    }

    synchronized public void service2(){
        System.out.println("print service2...");
        service3();
    }

    synchronized public void service3(){
        System.out.println("print service3...");
    }
}

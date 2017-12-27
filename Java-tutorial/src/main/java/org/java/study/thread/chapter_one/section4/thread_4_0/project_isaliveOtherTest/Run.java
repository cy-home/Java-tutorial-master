package org.java.study.thread.chapter_one.section4.thread_4_0.project_isaliveOtherTest;

public class Run {
    public static void main(String[] args) {
        CountOperate co = new CountOperate();
        Thread thread = new Thread(co);
        System.out.println("main begin thread isAlive="+thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main end thread isAlive="+thread.isAlive());
    }
}

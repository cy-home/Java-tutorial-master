package org.java.study.thread.chapter_one.section6.thread_6_0;

public class Test {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"----"+thread.getId());
    }
}

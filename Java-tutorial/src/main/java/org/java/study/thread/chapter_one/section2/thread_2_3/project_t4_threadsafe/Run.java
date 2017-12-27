package org.java.study.thread.chapter_one.section2.thread_2_3.project_t4_threadsafe;

public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();

        BLogin b = new BLogin();
        b.start();
    }
}

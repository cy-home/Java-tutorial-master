package org.java.study.thread.chapter_three.section1.thread_1_11.project_prTest;

public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP tp = new ThreadP(p);
        ThreadC tc = new ThreadC(c);
        tp.start();
        tc.start();
    }
}

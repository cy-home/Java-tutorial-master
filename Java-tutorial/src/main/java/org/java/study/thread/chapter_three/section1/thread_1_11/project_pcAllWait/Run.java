package org.java.study.thread.chapter_three.section1.thread_1_11.project_pcAllWait;

public class Run {
    public static void main(String[] args) {
        try {
            String lock = new String("");
            P p = new P(lock);
            C c = new C(lock);
            ThreadP[] pArray = new ThreadP[2];
            ThreadC[] cArray = new ThreadC[2];
            for (int i = 0; i < 2; i++) {
                pArray[i] = new ThreadP(p);
                pArray[i].setName("ThreadP-"+(i+1));
                pArray[i].start();
                cArray[i] = new ThreadC(c);
                cArray[i].setName("ThreadC-"+(i+1));
                cArray[i].start();
            }
            Thread.sleep(5000);
            Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
            Thread.currentThread().getThreadGroup().enumerate(threadArray);
            for (int i = 0; i < threadArray.length; i++) {
                System.out.println(threadArray[i].getName()+"---"+threadArray[i].getState());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

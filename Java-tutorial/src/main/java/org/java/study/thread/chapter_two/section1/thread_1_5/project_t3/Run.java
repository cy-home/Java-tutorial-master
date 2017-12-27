package org.java.study.thread.chapter_two.section1.thread_1_5.project_t3;

public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA a = new ThreadA(publicVar);
            a.setName("A");
            a.start();
            //打印结果受此值的大小影响，如果睡眠时间大于setValue()的睡眠时间，则值正常，反之值不正常
            Thread.sleep(1000);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

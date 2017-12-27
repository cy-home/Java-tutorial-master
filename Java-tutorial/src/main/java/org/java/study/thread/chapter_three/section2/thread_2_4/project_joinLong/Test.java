package org.java.study.thread.chapter_three.section2.thread_2_4.project_joinLong;

public class Test {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.join(2000);//只等2秒
            //Thread.sleep(2000);//效果一样
            System.out.println("main Timer="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

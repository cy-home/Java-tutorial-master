package org.java.study.thread.chapter_three.section2.thread_2_2.project_joinTest2;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            int secondValue = (int)(Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
            System.out.println("MyThread执行完了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

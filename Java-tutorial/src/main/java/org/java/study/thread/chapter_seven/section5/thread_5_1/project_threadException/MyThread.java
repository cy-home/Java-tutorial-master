package org.java.study.thread.chapter_seven.section5.thread_5_1.project_threadException;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        String userName = null;
        System.out.println(userName.hashCode());
        System.out.println("抛异常了啊！");
    }
}

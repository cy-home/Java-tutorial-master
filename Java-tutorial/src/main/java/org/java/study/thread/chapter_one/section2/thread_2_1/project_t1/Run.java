package org.java.study.thread.chapter_one.section2.thread_2_1.project_t1;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        //多次调用start()方法，会抛java.lang.IllegalThreadStateException异常
        //myThread.start();
        System.out.println("运行结束！");
    }
}

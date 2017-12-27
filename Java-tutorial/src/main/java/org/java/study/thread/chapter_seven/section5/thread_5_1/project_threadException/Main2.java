package org.java.study.thread.chapter_seven.section5.thread_5_1.project_threadException;

public class Main2 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("T1");
        //setUncaughtExceptionHandler()给指定线程对象设置异常处理器
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程："+t.getName()+" 出现了异常：");
                e.printStackTrace();
            }
        });
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("T2");
        t2.start();
    }
}

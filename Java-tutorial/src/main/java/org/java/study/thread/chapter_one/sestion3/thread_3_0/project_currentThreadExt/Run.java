package org.java.study.thread.chapter_one.sestion3.thread_3_0.project_currentThreadExt;

public class Run {
    public static void main(String[] args) {
        System.out.println("main()方法打印："+Thread.currentThread().getName());
        CountOperate co = new CountOperate();
        Thread thread = new Thread(co);
        thread.setName("A");
        thread.start();
    }
}

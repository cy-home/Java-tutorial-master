package org.java.study.thread.chapter_one.section8.thread_8_1.project_suspend_resume;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);

            //A段
            thread.suspend();//暂停
            System.out.println("A="+System.currentTimeMillis()+"---i="+thread.getI());
            Thread.sleep(20000);
            System.out.println("A="+System.currentTimeMillis()+"---i="+thread.getI());

            //B段
            System.out.println("线程恢复执行了...");
            thread.resume();//恢复
            Thread.sleep(10000);

            //C段
            thread.suspend();//暂停
            System.out.println("B="+System.currentTimeMillis()+"---i="+thread.getI());
            Thread.sleep(20000);
            System.out.println("B="+System.currentTimeMillis()+"---i="+thread.getI());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

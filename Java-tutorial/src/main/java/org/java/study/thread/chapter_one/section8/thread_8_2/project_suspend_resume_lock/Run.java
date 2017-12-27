package org.java.study.thread.chapter_one.section8.thread_8_2.project_suspend_resume_lock;

public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    super.run();
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);

            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    super.run();
                    System.out.println("thread2启动了，但进不了printString()！！！");
                    object.printString();
                }
            };
            thread2.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

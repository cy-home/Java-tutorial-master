package org.java.study.thread.chapter_one.section8.thread_8_3.project_suspend_resume;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyObject object = new MyObject();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                object.setValue("a","aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                super.run();
                object.printUsernamePassword();
            }
        };
        thread2.start();
    }
}

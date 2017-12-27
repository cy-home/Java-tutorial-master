package org.java.study.thread.chapter_one.section2.thread_2_1.project_randomThread;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        try{
            for (int i = 0; i < 10; i++) {
                int time =  (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=="+Thread.currentThread().getName()+"---ID="+Thread.currentThread().getId());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

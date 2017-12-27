package org.java.study.thread.chapter_two.section3.thread_3_6.project_atomicIntegerNoSafe;

public class Run {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            MyThread[] threadArray = new MyThread[5];
            for (int i = 0; i < threadArray.length; i++) {
                threadArray[i] = new MyThread(service);
            }
            for (int i = 0; i < threadArray.length; i++) {
                threadArray[i].start();
            }
            Thread.sleep(3000);
            System.out.println("读取值："+service.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

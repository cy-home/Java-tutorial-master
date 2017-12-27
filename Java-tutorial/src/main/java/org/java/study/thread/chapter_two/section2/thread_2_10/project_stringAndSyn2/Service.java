package org.java.study.thread.chapter_two.section2.thread_2_10.project_stringAndSyn2;

public class Service {

    public static void print(Object object){
        try {
            synchronized (object){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

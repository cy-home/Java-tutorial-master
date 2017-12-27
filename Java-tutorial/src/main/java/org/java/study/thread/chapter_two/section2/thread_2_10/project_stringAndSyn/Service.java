package org.java.study.thread.chapter_two.section2.thread_2_10.project_stringAndSyn;

public class Service {

    public static void print(String stringParam){
        try {
            synchronized (stringParam){
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

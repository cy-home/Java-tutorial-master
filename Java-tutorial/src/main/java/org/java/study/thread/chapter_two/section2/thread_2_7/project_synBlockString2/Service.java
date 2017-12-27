package org.java.study.thread.chapter_two.section2.thread_2_7.project_synBlockString2;

public class Service {

    private String anyString = new String();

    public void a(){
        try {
            synchronized (anyString){
                System.out.println("a method begin");
                Thread.sleep(3000);
                System.out.println("a method end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void b(){
        System.out.println("b method begin");
        System.out.println("b method end");
    }
}

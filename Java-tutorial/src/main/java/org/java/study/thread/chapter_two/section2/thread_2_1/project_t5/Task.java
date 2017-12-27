package org.java.study.thread.chapter_two.section2.thread_2_1.project_t5;

public class Task {
    private String getDate1;
    private String getDate2;

    public synchronized void doLongTimeTask(){
        try {
            System.out.println("begin task...");
            Thread.sleep(3000);
            getDate1 = "返回值1 threadName="+Thread.currentThread().getName();
            getDate2 = "返回值2 threadName="+Thread.currentThread().getName();
            System.out.println(getDate1);
            System.out.println(getDate2);
            System.out.println("end task...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

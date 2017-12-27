package org.java.study.thread.chapter_two.section2.thread_2_3.project_t6;

import java.awt.*;

public class Task {
    private String getDate1;
    private String getDate2;

    public void doLongTimeTask(){
        try {
            System.out.println("begin task...");
            Thread.sleep(3000);
            String getPrivateDate1 = "返回值1 threadName="+Thread.currentThread().getName();
            String getPrivateDate2 = "返回值2 threadName="+Thread.currentThread().getName();
            synchronized (this){
                getDate1 = getPrivateDate1;
                getDate2 = getPrivateDate2;
            }
            System.out.println(getDate1);
            System.out.println(getDate2);
            System.out.println("end task...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

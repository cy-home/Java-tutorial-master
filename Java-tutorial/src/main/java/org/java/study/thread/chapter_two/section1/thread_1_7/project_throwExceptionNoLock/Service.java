package org.java.study.thread.chapter_two.section1.thread_1_7.project_throwExceptionNoLock;

public class Service {
    public synchronized void testMethod(){
        if("a".equals(Thread.currentThread().getName())){
            System.out.println("thread A run beginTime="+System.currentTimeMillis());
            int i = 1;
            while (i==1){
                if(String.valueOf(Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("thread A run exceptionTime="+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else{
            System.out.println("thread B run Time="+System.currentTimeMillis());
        }
    }
}

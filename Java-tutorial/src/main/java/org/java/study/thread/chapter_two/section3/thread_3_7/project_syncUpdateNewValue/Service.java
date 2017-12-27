package org.java.study.thread.chapter_two.section3.thread_3_7.project_syncUpdateNewValue;

public class Service {

    private boolean isContinueRun = true;

    public void runMethod(){
        String anyString = new String();
        while (isContinueRun == true){
            synchronized (anyString){
               // System.out.println("同步块中的代码");
            }
        }
        System.out.println("停下来了");
    }

    public void stopMethod(){
        isContinueRun = false;
    }
}

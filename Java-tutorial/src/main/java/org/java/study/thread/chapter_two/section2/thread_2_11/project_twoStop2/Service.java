package org.java.study.thread.chapter_two.section2.thread_2_11.project_twoStop2;

public class Service {

    Object object1 = new Object();
    Object object2 = new Object();

    public void methodA(){
        synchronized (object1){
            System.out.println("methodA begin...");
            boolean isContinueRun = true;
            while (isContinueRun){
                //此处是个死循环,但是methodB()方法还是可以运行，因为对象锁不一样
            }
            System.out.println("methodA end...");
        }
    }

    public void methodB(){
        synchronized (object2){
            System.out.println("methodB begin...");
            System.out.println("methodB end...");
        }
    }
}

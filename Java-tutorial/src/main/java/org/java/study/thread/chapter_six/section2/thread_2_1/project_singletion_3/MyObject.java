package org.java.study.thread.chapter_six.section2.thread_2_1.project_singletion_3;

/**
 * 延迟加载/懒汉模式
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject(){}

    public static MyObject getInstance(){
        try {
            if(myObject == null){
                //模拟在创建之前做一些准备工作
                Thread.sleep(3000);
                //虽然部分代码被上锁，但还是有非线程安全问题
                synchronized (MyObject.class){
                    myObject = new MyObject();
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

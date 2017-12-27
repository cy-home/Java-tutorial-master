package org.java.study.thread.chapter_six.section2.thread_2_1.project_singletion_2;

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
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

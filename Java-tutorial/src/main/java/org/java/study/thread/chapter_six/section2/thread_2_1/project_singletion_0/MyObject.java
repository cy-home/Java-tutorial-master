package org.java.study.thread.chapter_six.section2.thread_2_1.project_singletion_0;

/**
 * 延迟加载/懒汉模式
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject(){}

    public static MyObject getInstance(){
         if(myObject == null){
             //在多线程情况下有问题
             myObject = new MyObject();
         }
         return myObject;
    }
}

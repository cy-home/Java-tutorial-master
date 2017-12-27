package org.java.study.thread.chapter_six.section1.thread_1_1.project_singletion_0;

/**
 * 立即加载/饿汉模式
 */
public class MyObject {

    //立即加载==饿汉模式
    private static MyObject myObject = new MyObject();

    private MyObject(){}

    public static MyObject getInstance(){
        return myObject;
    }
}

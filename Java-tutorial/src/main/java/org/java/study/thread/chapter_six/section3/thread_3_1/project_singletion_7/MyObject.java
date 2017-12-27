package org.java.study.thread.chapter_six.section3.thread_3_1.project_singletion_7;

public class MyObject {

    //内部类方式
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
    private MyObject(){}

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}

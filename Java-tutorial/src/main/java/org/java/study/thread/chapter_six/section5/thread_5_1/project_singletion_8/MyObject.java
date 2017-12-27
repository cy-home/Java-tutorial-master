package org.java.study.thread.chapter_six.section5.thread_5_1.project_singletion_8;

public class MyObject {
    private static MyObject myObject = null;
    static {
        myObject = new MyObject();
    }
    private MyObject(){}
    public static MyObject getInstance(){
        return myObject;
    }

}

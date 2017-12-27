package org.java.study.thread.chapter_six.section4.thread_4_1.project_singletion_7_1;

import java.io.Serializable;

public class MyObject implements Serializable {

    private static final long serializableUID = 888L;

    private static class MyObjectHandler{
        private static final MyObject myObject = new MyObject();
    }
    private MyObject(){}

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    protected Object readResolve(){
        System.out.println("调用了readResolve()...");
        return MyObjectHandler.myObject;
    }
}

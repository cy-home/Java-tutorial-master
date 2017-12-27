package org.java.study.thread.chapter_three.section3.thread_3_3.project_ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "我是默认值，第一次get不再为null";
    }
}

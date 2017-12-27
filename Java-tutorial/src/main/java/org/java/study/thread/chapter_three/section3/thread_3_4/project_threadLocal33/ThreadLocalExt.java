package org.java.study.thread.chapter_three.section3.thread_3_4.project_threadLocal33;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}

package org.java.study.thread.chapter_three.section3.thread_3_1.project_threadLocal11;

public class Run {

    public static ThreadLocal t1 = new ThreadLocal();
    public static void main(String[] args) {
        if(t1.get() == null){
            System.out.println("从未放过值");
            t1.set("zhangsan");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}

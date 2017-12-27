package org.java.study.thread.chapter_three.section3.thread_3_3.project_ThreadLocal22;

public class Run {

    public static ThreadLocalExt t1 = new ThreadLocalExt();
    public static void main(String[] args) {
        if(t1.get() == null){
            System.out.println("从未放过值");
            t1.set("zhangsan");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}

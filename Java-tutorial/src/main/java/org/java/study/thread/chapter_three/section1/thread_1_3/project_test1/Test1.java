package org.java.study.thread.chapter_three.section1.thread_1_3.project_test1;

public class Test1 {

    public static void main(String[] args) {
        try {
            String newString = new String();
            //抛异常的原因是：wait()必须在同步代码块内
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

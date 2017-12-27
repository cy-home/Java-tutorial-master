package org.java.study.thread.chapter_two.section2.thread_2_10.project_stringAndSyn;

public class Test {
    public static void main(String[] args) {
        //JVM具有String常量池缓存功能，所以结果都为true
        String a = "a";
        String b = "a";
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}

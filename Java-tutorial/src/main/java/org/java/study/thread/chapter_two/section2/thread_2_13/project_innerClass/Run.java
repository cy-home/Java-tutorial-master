package org.java.study.thread.chapter_two.section2.thread_2_13.project_innerClass;

public class Run {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("zhangsan");
        publicClass.setPassword("123456");
        System.out.println("username="+publicClass.getUsername()+"---password="+publicClass.getPassword());
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("12");
        privateClass.setAddress("北京市");
        System.out.println("age="+privateClass.getAge()+"---address="+privateClass.getAddress());
    }
}
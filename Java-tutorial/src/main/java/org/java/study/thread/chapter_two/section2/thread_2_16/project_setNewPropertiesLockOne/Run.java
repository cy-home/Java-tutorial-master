package org.java.study.thread.chapter_two.section2.thread_2_16.project_setNewPropertiesLockOne;

public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            Userinfo userinfo = new Userinfo();
            ThreadA a = new ThreadA(service,userinfo);
            a.setName("A");
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(service,userinfo);
            b.setName("B");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

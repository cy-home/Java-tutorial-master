package org.java.study.thread.chapter_two.section2.thread_2_16.project_setNewPropertiesLockOne;

public class Service {

    public void serviceMethodA(Userinfo userinfo){
        synchronized (userinfo){
            try {
                System.out.println(Thread.currentThread().getName()+" begin serviceMethodA");
                userinfo.setUsername("abcabc");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+" end serviceMethodA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

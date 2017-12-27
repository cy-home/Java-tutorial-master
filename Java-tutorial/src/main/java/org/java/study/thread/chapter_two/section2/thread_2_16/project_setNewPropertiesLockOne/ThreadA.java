package org.java.study.thread.chapter_two.section2.thread_2_16.project_setNewPropertiesLockOne;

public class ThreadA extends Thread {

    private Service service;
    private Userinfo userinfo;

    public ThreadA(Service service,Userinfo userinfo){
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        super.run();
        this.service.serviceMethodA(this.userinfo);
    }
}

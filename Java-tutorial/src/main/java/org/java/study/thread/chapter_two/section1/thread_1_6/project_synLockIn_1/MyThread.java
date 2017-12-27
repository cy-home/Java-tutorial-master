package org.java.study.thread.chapter_two.section1.thread_1_6.project_synLockIn_1;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }
}

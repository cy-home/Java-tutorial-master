package org.java.study.thread.chapter_two.section1.thread_1_8.project_synNotExtends;

public class Sub extends Main {

    @Override
    public synchronized void serviceMethod() {
        try {
            System.out.println("int sub sleep begin threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub sleep end threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

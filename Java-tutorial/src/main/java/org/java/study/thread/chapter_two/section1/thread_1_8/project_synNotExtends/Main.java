package org.java.study.thread.chapter_two.section1.thread_1_8.project_synNotExtends;

public class Main {

    public synchronized void serviceMethod(){
        try {
            System.out.println("int main sleep begin threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main sleep end threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

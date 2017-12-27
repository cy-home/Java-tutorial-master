package org.java.study.thread.chapter_four.section1.thread_1_7.project_conditionTest;

public class MyThreadA extends Thread {

    private MyService service;

    public MyThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.set();
        }
    }
}

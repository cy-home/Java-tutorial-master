package org.java.study.thread.chapter_four.section1.thread_1_8.project_conditionTestMany;

public class MyThreadB extends Thread {

    private MyService service;

    public MyThreadB(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.get();
        }
    }
}

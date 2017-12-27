package org.java.study.thread.chapter_four.section1.thread_1_11.project_lockTest2;

import sun.org.mozilla.javascript.internal.ast.ForInLoop;

public class Run {

    public static void main(String[] args) {
        try {
            final Service service = new Service();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    service.waitMethod();
                }
            };
            Thread[] threadArray = new Thread[10];
            for (int i = 0; i < 10; i++) {
                threadArray[i] = new Thread(runnable);
            }
            for (int i = 0; i < 10; i++) {
                threadArray[i].start();
            }
            Thread.sleep(2000);
            service.notifyMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

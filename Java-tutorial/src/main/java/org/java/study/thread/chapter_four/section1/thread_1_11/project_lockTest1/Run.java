package org.java.study.thread.chapter_four.section1.thread_1_11.project_lockTest1;

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
            Thread a = new Thread(runnable);
            a.start();

            Thread.sleep(500);
            Thread b = new Thread(runnable);
            b.start();
            Thread.sleep(500);

            System.out.println(service.lock.hasQueuedThread(a));
            System.out.println(service.lock.hasQueuedThread(b));
            System.out.println(service.lock.hasQueuedThreads());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

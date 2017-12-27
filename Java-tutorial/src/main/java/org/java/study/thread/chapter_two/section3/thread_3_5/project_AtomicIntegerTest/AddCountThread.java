package org.java.study.thread.chapter_two.section3.thread_3_5.project_AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AddCountThread extends Thread {

    //AtomicInteger,AtomicLong,AtomicBoolean
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            System.out.println("i="+count.incrementAndGet());
        }
    }
}

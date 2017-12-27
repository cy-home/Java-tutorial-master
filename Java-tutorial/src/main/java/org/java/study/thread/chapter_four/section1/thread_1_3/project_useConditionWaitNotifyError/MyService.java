package org.java.study.thread.chapter_four.section1.thread_1_3.project_useConditionWaitNotifyError;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            //在调用await()之前必须要有对象监视器，要有锁
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

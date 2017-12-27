package org.java.study.thread.chapter_four.section1.thread_1_16.project_condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {

    private volatile static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    private final static Condition conditionA = lock.newCondition();
    private final static Condition conditionB = lock.newCondition();
    private final static Condition conditionC = lock.newCondition();

    public static void main(String[] args) {

        Thread threadA = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    lock.lock();
                    while (nextPrintWho !=1){
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadA "+(i+1));
                    }
                    nextPrintWho = 2;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    lock.lock();
                    while (nextPrintWho !=2){
                        conditionB.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadB "+(i+1));
                    }
                    nextPrintWho = 3;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadC = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    lock.lock();
                    while (nextPrintWho !=3){
                        conditionC.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadC "+(i+1));
                    }
                    nextPrintWho = 1;
                    conditionA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];
        for (int i = 0; i < 5; i++) {
            aArray[i] = new Thread(threadA);
            bArray[i] = new Thread(threadB);
            cArray[i] = new Thread(threadC);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }
    }
}

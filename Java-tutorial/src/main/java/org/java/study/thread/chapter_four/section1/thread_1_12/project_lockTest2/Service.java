package org.java.study.thread.chapter_four.section1.thread_1_12.project_lockTest2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock ;

    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println("serviceMethod begin isHeldByCurrentThread="+lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println("serviceMethod end isHeldByCurrentThread="+lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}

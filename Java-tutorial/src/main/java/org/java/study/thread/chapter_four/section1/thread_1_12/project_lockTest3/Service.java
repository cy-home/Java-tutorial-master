package org.java.study.thread.chapter_four.section1.thread_1_12.project_lockTest3;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println("serviceMethod begin isLocked="+lock.isLocked());
            lock.lock();
            System.out.println("serviceMethod end isLocked="+lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}

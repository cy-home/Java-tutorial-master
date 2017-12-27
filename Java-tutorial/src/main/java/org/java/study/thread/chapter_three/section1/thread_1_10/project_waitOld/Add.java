package org.java.study.thread.chapter_three.section1.thread_1_10.project_waitOld;

public class Add {

    private String lock;

    public Add(String lock){
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}

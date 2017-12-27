package org.java.study.thread.chapter_three.section1.thread_1_14.project_waitNotifyInsertTest;

import java.lang.reflect.WildcardType;

public class DBTools {

    private volatile boolean prevIsA = false;

    public synchronized void backupA(){
        try {
            while (prevIsA == true){
                this.wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("@@@@@");
            }
            prevIsA = true;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void backupB(){
        try {
            while (prevIsA == false){
                this.wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("&&&&&");
            }
            prevIsA = false;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

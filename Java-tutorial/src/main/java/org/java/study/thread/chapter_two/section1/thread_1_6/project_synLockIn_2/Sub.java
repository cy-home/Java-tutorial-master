package org.java.study.thread.chapter_two.section1.thread_1_6.project_synLockIn_2;

public class Sub extends Main {

    public synchronized void operateISubMethod() {
        try {
            while (i>0){
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

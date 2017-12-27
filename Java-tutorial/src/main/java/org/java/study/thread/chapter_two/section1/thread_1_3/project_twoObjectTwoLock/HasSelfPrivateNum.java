package org.java.study.thread.chapter_two.section1.thread_1_3.project_twoObjectTwoLock;

import java.util.concurrent.ExecutionException;

public class HasSelfPrivateNum {
    private int num =0;

    synchronized public void addI(String username){
        try {
            if(username.equals("a")){
                num = 100;
                System.out.println(Thread.currentThread().getName()+" a set over! hashCode="+this.hashCode());
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println(Thread.currentThread().getName()+" b set over! hashCode="+this.hashCode());
            }
            System.out.println(Thread.currentThread().getName()+" username = [" + username + "]---num = ["+num+"], hashCode="+this.hashCode());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

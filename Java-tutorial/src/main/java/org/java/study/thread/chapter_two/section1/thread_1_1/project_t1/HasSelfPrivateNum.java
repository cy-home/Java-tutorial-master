package org.java.study.thread.chapter_two.section1.thread_1_1.project_t1;

public class HasSelfPrivateNum {

    public void addI(String username){
        try {
            int num = 0;
            if(username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println("username = [" + username + "]"+"---num= ["+num+"]");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

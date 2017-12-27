package org.java.study.thread.chapter_two.section1.thread_1_5.project_t3;

public class PublicVar {
    public String username = "A";
    public String password = "AA";

    /**
     * 只对写进行同步操作
     * @param username
     * @param password
     */
    synchronized public void setValue(String username,String password){
        try {
            this.username = username;
            Thread.sleep(2000);
            this.password = password;
            System.out.println("setValue method threadName = ["+Thread.currentThread().getName()+"] username = [" + username + "], password = [" + password + "]");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读操作未同步
     */
    public void getValue(){
        System.out.println("getValue method threadName = ["+Thread.currentThread().getName()+"] username = [" + username + "], password = [" + password + "]");
    }
}

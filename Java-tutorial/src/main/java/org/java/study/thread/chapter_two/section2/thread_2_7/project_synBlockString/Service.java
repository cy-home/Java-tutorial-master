package org.java.study.thread.chapter_two.section2.thread_2_7.project_synBlockString;

public class Service {

    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void setUsernamePassword(String username,String password){
        try {
            //对象监视器必须是同一个对象，才能同步运行
            synchronized (anyString){
                System.out.println("线程 "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 进入同步块");
                this.usernameParam = username;
                Thread.sleep(3000);
                this.passwordParam = password;
                System.out.println("线程 "+Thread.currentThread().getName()+" 在 "+System.currentTimeMillis()+" 离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

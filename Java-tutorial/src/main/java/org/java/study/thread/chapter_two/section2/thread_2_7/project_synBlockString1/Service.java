package org.java.study.thread.chapter_two.section2.thread_2_7.project_synBlockString1;

public class Service {

    private String usernameParam;
    private String passwordParam;

    public void setUsernamePassword(String username,String password){
        try {
            //对象监视器不是同一个对象，运行结果就异步调用了，交叉运行
            String anyString = new String();
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

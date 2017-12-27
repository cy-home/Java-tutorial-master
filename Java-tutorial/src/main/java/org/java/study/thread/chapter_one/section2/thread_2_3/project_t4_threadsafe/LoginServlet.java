package org.java.study.thread.chapter_one.section2.thread_2_3.project_t4_threadsafe;

/**
 * 本例模拟Servlet组件
 */
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void post(String username,String password){
        try{
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println(Thread.currentThread().getName()+" username = [" + usernameRef + "], password = [" + password + "]");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

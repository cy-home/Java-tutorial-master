package org.java.study.thread.chapter_one.section7.thread_7_7.project_stopLock;

public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            //强制stop会造成数据不一致
            thread.stop();
            System.out.println(object.getUsername()+"---"+object.getPassword());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

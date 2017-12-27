package org.java.study.thread.chapter_six.section2.thread_2_1.project_singletion_5;

/**
 * 延迟加载/懒汉模式
 */
public class MyObject {

    //使用双检机制来解决非线程安全，既保证了不需要同步的代码异步执行性，又保证了单例效果
    private volatile static MyObject myObject;

    private MyObject(){}

    public static MyObject getInstance(){
        try {
            //模拟在创建之前做一些准备工作
            Thread.sleep(3000);
            synchronized (MyObject.class){
                if(myObject == null) {
                    myObject = new MyObject();
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

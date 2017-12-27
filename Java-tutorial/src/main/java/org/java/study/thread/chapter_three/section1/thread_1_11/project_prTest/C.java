package org.java.study.thread.chapter_three.section1.thread_1_11.project_prTest;

/**
 * 消费者
 */
public class C {

    private String lock;

    public C(String  lock){
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值是："+ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

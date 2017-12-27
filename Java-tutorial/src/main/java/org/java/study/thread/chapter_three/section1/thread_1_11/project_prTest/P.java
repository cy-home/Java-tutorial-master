package org.java.study.thread.chapter_three.section1.thread_1_11.project_prTest;

/**
 * 生产者
 */
public class P {
    private String lock;

    public P(String lock){
        this.lock = lock;
    }
    public void setValue(){
        try {
            synchronized (lock){
                if(!"".equals(ValueObject.value)){
                    lock.wait();
                }
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set的值是："+value);
                ValueObject.value = value;
                lock.notify();;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

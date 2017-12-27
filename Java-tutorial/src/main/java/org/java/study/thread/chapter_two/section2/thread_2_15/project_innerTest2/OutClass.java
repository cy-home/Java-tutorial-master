package org.java.study.thread.chapter_two.section2.thread_2_15.project_innerTest2;

public class OutClass {

    static class InnerClass1{
        public void method1(InnerClass2 innerClass2){
            synchronized (innerClass2){
                System.out.println(Thread.currentThread().getName()+" 进入InnerClass1类中的method1方法");
                for (int i = 1; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" 离开InnerClass1类中的method1方法");
            }
        }
        public synchronized void method2(){
            System.out.println(Thread.currentThread().getName()+" 进入InnerClass1类中的method2方法");
            for (int i = 11; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()+" j="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+" 离开InnerClass1类中的method2方法");
        }
    }
    static class InnerClass2{
        public synchronized void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" 进入InnerClass2类中的method1方法");
            for (int i = 0; i < 10; i++) {
                System.out.println("k="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+" 离开InnerClass2类中的method1方法");
        }
    }
}
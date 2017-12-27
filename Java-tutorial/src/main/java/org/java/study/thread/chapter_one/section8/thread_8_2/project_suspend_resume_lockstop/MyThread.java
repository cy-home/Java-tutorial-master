package org.java.study.thread.chapter_one.section8.thread_8_2.project_suspend_resume_lockstop;

public class MyThread extends  Thread {
    private int i =0;
    @Override
    public void run() {
        super.run();
        while (true){
            i++;
            //System.out.println("i="+i)这行代码内部停止时，同步锁未被释放
            System.out.println("i="+i);
        }
    }
}

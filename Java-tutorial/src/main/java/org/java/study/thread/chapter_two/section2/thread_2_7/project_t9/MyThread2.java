package org.java.study.thread.chapter_two.section2.thread_2_7.project_t9;

public class MyThread2 extends  Thread {

    private MyOneList list ;

    public MyThread2(MyOneList list){
        this.list = list;
    }

    @Override
    public void run() {
        super.run();

        MyService service = new MyService();
        service.addServiceMethod(list,"B");
    }
}

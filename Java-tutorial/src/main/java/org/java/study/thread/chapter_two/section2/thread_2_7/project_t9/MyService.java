package org.java.study.thread.chapter_two.section2.thread_2_7.project_t9;

public class MyService {

    public MyOneList addServiceMethod(MyOneList list,String data){
        try {
            synchronized (list){
                if(list.getSize() < 1){
                    Thread.sleep(2000);//模拟从远程取数据话费2秒取回数据
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}

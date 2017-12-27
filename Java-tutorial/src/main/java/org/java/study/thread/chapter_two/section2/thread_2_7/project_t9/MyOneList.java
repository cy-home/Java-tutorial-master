package org.java.study.thread.chapter_two.section2.thread_2_7.project_t9;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

    private List list = new ArrayList();

    public synchronized void add(String data){
        list.add(data);
    }

    public synchronized int getSize(){
        return list.size();
    }
}

package org.java.study.thread.chapter_three.section1.thread_1_1.project_TowThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private List list = new ArrayList();

    public void add(){
        list.add("高洪岩");
    }

    public int size(){
        return list.size();
    }
}

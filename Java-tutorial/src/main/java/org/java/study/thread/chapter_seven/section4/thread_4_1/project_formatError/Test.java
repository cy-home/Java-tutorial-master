package org.java.study.thread.chapter_seven.section4.thread_4_1.project_formatError;

import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{"2017-01-01","2017-01-01","2017-01-02","2017-01-03",
                "2017-01-04","2017-01-05","2017-01-06","2017-01-07","2017-01-08","2017-01-09"};
        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(sdf,dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}

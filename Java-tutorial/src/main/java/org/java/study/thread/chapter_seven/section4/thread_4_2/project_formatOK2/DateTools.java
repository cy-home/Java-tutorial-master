package org.java.study.thread.chapter_seven.section4.thread_4_2.project_formatOK2;

import java.text.SimpleDateFormat;


public class DateTools {
    private static ThreadLocal<SimpleDateFormat> threadLocalDateFormat = new ThreadLocal<SimpleDateFormat>();

    public static SimpleDateFormat getSimpleDateFormat(String formatPattern){
        SimpleDateFormat sdf = null;
        sdf = threadLocalDateFormat.get();
        if(sdf == null){
            sdf = new SimpleDateFormat(formatPattern);
            threadLocalDateFormat.set(sdf);
        }
        return sdf;
    }

}

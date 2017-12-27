package org.java.study.thread.chapter_seven.section4.thread_4_2.project_formatOK1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建了多个SimpleDateFormat
 */
public class DateTools {
    public static Date parse(String formatPattern,String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern,Date date){
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }
}

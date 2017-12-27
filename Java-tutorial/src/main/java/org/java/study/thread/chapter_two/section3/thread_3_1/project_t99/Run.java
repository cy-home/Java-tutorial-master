package org.java.study.thread.chapter_two.section3.thread_3_1.project_t99;

public class Run {

    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("停止线程！");
        //停止不了，一直在死循环中
        printString.setContinuePrint(false);
    }
}

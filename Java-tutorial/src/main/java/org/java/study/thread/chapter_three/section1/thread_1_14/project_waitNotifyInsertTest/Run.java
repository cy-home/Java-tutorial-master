package org.java.study.thread.chapter_three.section1.thread_1_14.project_waitNotifyInsertTest;

public class Run {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }
    
}

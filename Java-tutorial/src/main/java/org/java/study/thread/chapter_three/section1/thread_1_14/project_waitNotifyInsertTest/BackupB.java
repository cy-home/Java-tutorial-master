package org.java.study.thread.chapter_three.section1.thread_1_14.project_waitNotifyInsertTest;

public class BackupB extends Thread {

    private DBTools dbTools;

    public BackupB(DBTools dbTools){
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        this.dbTools.backupB();
    }
}

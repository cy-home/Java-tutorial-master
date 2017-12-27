package org.java.study.thread.chapter_three.section1.thread_1_12.project_pipeInputOutput;

import java.io.PipedInputStream;

public class ThreadRead extends Thread {

    private ReadData read;
    private PipedInputStream input ;

    public ThreadRead(ReadData read,PipedInputStream input){
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        super.run();
        this.read.readMethod(input);
    }
}

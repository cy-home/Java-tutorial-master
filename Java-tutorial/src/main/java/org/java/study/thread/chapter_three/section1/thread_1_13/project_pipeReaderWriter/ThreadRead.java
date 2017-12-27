package org.java.study.thread.chapter_three.section1.thread_1_13.project_pipeReaderWriter;

import java.io.PipedReader;

public class ThreadRead extends Thread {

    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read,PipedReader input){
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        super.run();
        this.read.readMethod(input);
    }
}

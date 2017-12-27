package org.java.study.thread.chapter_three.section1.thread_1_12.project_pipeInputOutput;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {

    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write,PipedOutputStream out){
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        this.write.writeMethod(out);
    }
}

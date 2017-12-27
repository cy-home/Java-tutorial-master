package org.java.study.thread.chapter_three.section1.thread_1_13.project_pipeReaderWriter;

import java.io.PipedWriter;

public class ThreadWrite extends Thread {

    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write,PipedWriter out){
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        this.write.writeMethod(out);
    }
}

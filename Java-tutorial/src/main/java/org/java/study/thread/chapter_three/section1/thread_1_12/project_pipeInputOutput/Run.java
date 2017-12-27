package org.java.study.thread.chapter_three.section1.thread_1_12.project_pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

    public static void main(String[] args) {
        WriteData write = new WriteData();
        ReadData read = new ReadData();

        try {
            PipedOutputStream out = new PipedOutputStream();
            PipedInputStream input = new PipedInputStream();

            //产生线程间的通信连接
            input.connect(out);
            //out.connect(input);
            ThreadRead tr = new ThreadRead(read,input);
            tr.start();
            Thread.sleep(2000);
            ThreadWrite tw = new ThreadWrite(write,out);
            tw.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

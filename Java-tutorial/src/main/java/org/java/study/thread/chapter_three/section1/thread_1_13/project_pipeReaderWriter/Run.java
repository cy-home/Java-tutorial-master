package org.java.study.thread.chapter_three.section1.thread_1_13.project_pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {

    public static void main(String[] args) {
        try {
            WriteData write = new WriteData();
            ReadData read = new ReadData();

            PipedWriter outputStream = new PipedWriter();
            PipedReader inputStream = new PipedReader();
            outputStream.connect(inputStream);
            ThreadRead tr = new ThreadRead(read,inputStream);
            tr.start();

            Thread.sleep(2000);
            ThreadWrite tw = new ThreadWrite(write,outputStream);
            tw.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

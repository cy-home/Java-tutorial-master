package org.java.study.io.bytesio;

import org.junit.Test;

import java.io.IOException;

public class FileOutputStreamExampleTest {

    @Test
    public void test() throws IOException {
        new FileOutputStreamExample().writeToFile();
    }
}

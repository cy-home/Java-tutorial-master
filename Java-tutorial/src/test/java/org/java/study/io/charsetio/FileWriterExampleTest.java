package org.java.study.io.charsetio;

import org.junit.Test;

import java.io.IOException;

public class FileWriterExampleTest {
    @Test
    public void testWriteToFile() throws IOException {
        new FileWriterExample().writeToFile();
    }
}

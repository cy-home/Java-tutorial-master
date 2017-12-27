package org.java.study.io.charsetio;

import org.junit.Test;

import java.io.IOException;

public class OutputStreamWriterExampleTest {
    @Test
    public void testWriteToFile() throws IOException {
        new OutputStreamWriterExample().writeToFile();
    }
}

package org.java.study.io.charsetio;

import org.junit.Test;

import java.io.IOException;

public class BufferedWriterExampleTest {

    @Test
    public void testWriteToFile() throws IOException {
        new BufferedWriterExample().writeToFile();
    }
}

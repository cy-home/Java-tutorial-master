package org.java.study.io.bytesio;

import org.junit.Test;

import java.io.IOException;

public class ByteArrayOutPutStreamExampleTestTest {

    @Test
    public void testWriteFromFile() throws IOException {
        new ByteArrayOutPutStreamExample().writeToBytes();
    }
}

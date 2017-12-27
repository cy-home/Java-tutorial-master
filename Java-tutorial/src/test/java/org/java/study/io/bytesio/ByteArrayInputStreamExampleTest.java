package org.java.study.io.bytesio;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class ByteArrayInputStreamExampleTest {

    @Test
    public void testReadFromArray() throws IOException {
        byte[] bytes = new byte[]{0x1,0x2,0x3,0x4,0x5,0x6,0x7};
        ByteArrayInputStreamExample bais = new ByteArrayInputStreamExample();
        System.out.println("读取后的内容："+bais.readFromArray(bytes));
    }

    @Test
    public void testReadMarkAndReset() throws IOException {
        byte[] bytes = new byte[]{0x1,0x2,0x3,0x4,0x5,0x6,0x7};
        new ByteArrayInputStreamExample().readMarkAndReset(bytes,2);
    }
}

package org.java.study.io.bytesio;

import java.io.*;

public class ByteArrayOutPutStreamExample {

    public void writeToBytes() throws IOException {
        InputStream is = new FileInputStream("D://study/read_file.txt");
        ByteArrayOutputStream baOut = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        while (is.read(bytes)!=-1){
            baOut.write(bytes);
        }
        baOut.flush();
        System.out.println("读取的文件内容："+baOut.toString("UTF-8"));
        baOut.close();
        is.close();
    }
}

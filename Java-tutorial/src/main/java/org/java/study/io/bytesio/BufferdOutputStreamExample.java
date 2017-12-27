package org.java.study.io.bytesio;

import java.io.*;
import java.nio.charset.Charset;

public class BufferdOutputStreamExample {

    public void writeToFile() throws IOException {
        FileOutputStream fos = new FileOutputStream("D://study/write_file.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        FileInputStream fis = new FileInputStream("D://study/read_file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        System.out.println("#########开始写入内容#########");
        while (bis.read(bytes)!=-1){
            bos.write(bytes);
        }
        bos.flush();
        bos.close();
        bis.close();
        fis.close();
        System.out.println("#########写入内容成功#########");
    }

    public static void main(String[] args) throws IOException {
        BufferdOutputStreamExample bos = new BufferdOutputStreamExample();
        bos.writeToFile();
    }
}

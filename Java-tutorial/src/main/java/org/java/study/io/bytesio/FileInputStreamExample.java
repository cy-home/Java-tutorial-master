package org.java.study.io.bytesio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

    public void readFromFile() throws Exception {
        FileInputStream fis = new FileInputStream(new java.io.File("D://study/read_file.txt"));
        StringBuffer sb = new StringBuffer();
        byte[] bytes = new byte[1024];
        while (fis.read(bytes) !=-1){
            sb.append(new String(bytes));
        }
        System.out.println("读取文件内容："+sb.toString());
    }
}

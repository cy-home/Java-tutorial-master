package org.java.study.io.bytesio;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class BufferdInputStreamExample {

    public void readFromFile() throws IOException {
       FileInputStream fis = new FileInputStream("D://study/read_file.txt");
       BufferedInputStream bis = new BufferedInputStream(fis);
       byte[] bytes = new byte[1024];
        try {
            System.out.println("**********读取内容开始**************");
            while (bis.read(bytes)!=-1){
                String str = new String(bytes);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        bis.close();
        fis.close();
    }

}

package org.java.study.io.charsetio;

import java.io.*;

public class InputStreamReaderExample {
    public void readFromFile() throws IOException {
        InputStream is = new FileInputStream("D://study/read_file.txt");
        Reader reader = new InputStreamReader(is);
        char[] chars = new char[1024];
        System.out.println("**************开始读取文件内容************");
        while (reader.read(chars)!=-1){
            System.out.println(new String(chars));
        }
        reader.close();
        is.close();

    }
}

package org.java.study.io.charsetio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public void readFromFile() throws IOException {
        FileReader fr = new FileReader("D://study/read_file.txt");
        BufferedReader reader = new BufferedReader(fr);
        String str = "" ;
        System.out.println("**********开始读取文件内容****************");
        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }
        reader.close();
        fr.close();
    }
}

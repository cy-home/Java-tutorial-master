package org.java.study.io.charsetio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public void readFromFile() throws IOException {
        FileReader fr = new FileReader("D://study/read_file.txt");
        char[] chars = new char[1024];
        System.out.println("**********读取文件内容***********");
        while (fr.read(chars)!=-1){
            System.out.println(chars);
        }
    }
}

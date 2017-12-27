package org.java.study.io.charsetio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("D://study/write_file.txt");
        FileReader fr = new FileReader("D://study/read_file.txt");
        char[] chars = new char[1024];
        while (fr.read(chars)!=-1){
            fw.write(chars);
        }
        fw.flush();
        System.out.println("*********文件写入成功*************");
        fw.close();
        fr.close();
    }
}

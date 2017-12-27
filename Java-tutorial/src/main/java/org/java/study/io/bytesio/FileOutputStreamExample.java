package org.java.study.io.bytesio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public void writeToFile() throws IOException {
        FileOutputStream fos = new FileOutputStream("D://study/write_file.txt");

        FileInputStream fis = new FileInputStream(new java.io.File("D://study/read_file.txt"));
        byte[] bytes = new byte[1024];
        while (fis.read(bytes) !=-1){
            fos.write(bytes);
        }
        fos.flush();
        System.out.println("写入文件成功!");
        fos.close();
        fis.close();
    }
}

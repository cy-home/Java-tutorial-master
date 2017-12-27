package org.java.study.io.charsetio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("D://study/write_file.txt");
        BufferedWriter writer = new BufferedWriter(fw);
        for (int i = 0; i < 100000; i++) {
            String str = "放开价格了的萨dd";
            writer.write(str);
        }
        writer.flush();
        System.out.println("***********写入文件成功*************");
        writer.close();
    }

}

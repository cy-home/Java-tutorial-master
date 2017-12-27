package org.java.study.io.charsetio;

import java.io.*;

public class OutputStreamWriterExample {
    public void writeToFile() throws IOException {
        OutputStream os = new FileOutputStream("D://study/write_file.txt");
        Writer writer = new OutputStreamWriter(os);

        InputStream is = new FileInputStream("D://study/read_file.txt");
        Reader reader = new InputStreamReader(is);
        char[] chars = new char[1024];
        while (reader.read(chars)!=-1){
            writer.write(chars);
            writer.write("\r\n");
        }
        writer.flush();
        System.out.println("***********文件写入成功*************");
        writer.close();
        os.close();

        reader.close();
        is.close();
    }
}

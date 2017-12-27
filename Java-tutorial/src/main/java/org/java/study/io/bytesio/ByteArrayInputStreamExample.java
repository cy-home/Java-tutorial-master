package org.java.study.io.bytesio;

import com.sun.security.auth.SolarisNumericUserPrincipal;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {

    public String readFromArray(byte[] bytes) throws IOException {
        StringBuffer sb = new StringBuffer();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        int temp;
        while ((temp = bais.read()) !=-1){
            sb.append(Integer.toHexString(temp));
        }
        bais.close();
        return sb.toString();
    }

    public void readMarkAndReset(byte[] bytes,int mark) throws IOException {
        StringBuffer sb = new StringBuffer();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        bais.mark(mark);
        bais.skip(mark+1);
        int temp;
        while((temp = bais.read())!=-1){
            sb.append(Integer.toHexString(temp));
        }
        System.out.println("越过标记后的字符串："+sb.toString());

        bais.reset();
        sb.setLength(0);
        int temp2;
        while((temp2 = bais.read())!=-1){
            sb.append(Integer.toHexString(temp2));
        }
        System.out.println("重置之后的字符串："+sb.toString());
        bais.close();
    }
}

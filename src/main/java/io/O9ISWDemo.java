package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class O9ISWDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        int d = -1;
        /**
         * 转换流的int read()方法会结合指定的字符集
         * 以及实际读取的数据自动分析出应当读取几个字节并将其转换为对应字符进行返回
         */
        while ((d=isr.read())!=-1){
            System.out.println((char)d);
        }
        isr.close();
    }
}

package raf;

import java.io.FileInputStream;
import java.io.IOException;

public class O13FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =
                new FileInputStream("fos.txt");
        byte[] data = new byte[1024];
        int len = fis.read(data);
        System.out.println("实际读取了"+len+"个字节");

        String str = new String(data,0,len,"GBK");
        System.out.println(str);
        fis.close();
    }
}

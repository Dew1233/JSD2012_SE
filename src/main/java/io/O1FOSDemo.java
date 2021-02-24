package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class O1FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =
                new FileOutputStream("fos.txt",true);
        String str = "星星之火可以燎原";
        byte[] data = str.getBytes("gbk");

        fos.write(data);
        System.out.println("写出完毕");
        fos.close();
    }
}

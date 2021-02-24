package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class O5BOS_FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "星星之后可以燎原";
        byte[] data = str.getBytes("utf-8");
        bos.write(data);
        bos.flush();
        System.out.println("写出完毕");
        bos.close();


    }
}

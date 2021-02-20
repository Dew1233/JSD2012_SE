package raf;

/**
 * byte[] data = str.getBytes("utf-8");
 * raf.write(data)
 * 使用byte类型数组
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class O5WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("raf.txt","rw");
        String str = "社会主义兄弟情";
        byte[] data = str.getBytes("utf-8");
        raf.write(data);
        System.out.println("写出完毕");
        raf.close();
    }
}

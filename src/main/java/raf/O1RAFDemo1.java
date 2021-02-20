package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile
 * 可以对文件的内容进行任意的读写
 */
public class O1RAFDemo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("./fgk.dat","rw");

        raf.write(1);
        System.out.println("写出完毕");
        raf.close();
    }

}

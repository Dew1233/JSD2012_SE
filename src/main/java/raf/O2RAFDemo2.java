package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class O2RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("./raf.dat","r");
        int d = raf.read();
        System.out.println(d);

        /**
         * int read()
         * 从文件中读取一个字节，并装载到int值的低8位上
         * 将其返回，若返回的int值为-1则表示读取文件的末尾
         */
        d = raf.read();
        System.out.println(d);
        raf.close();
    }
}

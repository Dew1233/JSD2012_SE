package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * void write(byte[] data)
 * 定义一个数组，将给定的字节数组中所有字节一次性写出提高运行效率
 *
 * 单字节读写是一种随机读写形式 一组字节读写是块读写形式
 *
 * int read(byte[] data)
 * 一次性读取给定字节数组总长度的字节量
 * 并存入到该数组中，返回值为实际读取道德字节量
 * 返回值为-1 则表示已到末尾
 *
 * void write(byte[] data)
 * 将给定的字节数组中所有字节一次性写出
 *
 * void write(byte[] data ,int offest,int len)
 * 将给定的字节数组从下标offset处连续len个字节一次性写出
 */

public class O4CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src =
                new RandomAccessFile("./tts.zip","r");
        RandomAccessFile desc =
                new RandomAccessFile("./tts_cp.zip","rw");

        byte[] buf = new byte[1024*10];
        int len = -1;//每次实际读取到的字节

        long start = System.currentTimeMillis();
        while ((len = src.read(buf))!=-1){
            desc.write(buf,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕，耗时"+(end-start)+"ms");
        src.close();
        desc.close();
    }
}

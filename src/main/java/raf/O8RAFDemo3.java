package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * seek(int pos)
 * 定位指针位置
 *
 * long getFilePointer()
 * 获取当前RAF的指针位置
 *
 * RAF提供了所有基本类型的写出操作
 * writeLong方法会连续写8字节，将对应的long值写入文件
 *
 * RAF提供了读取基本类型的相关方法
 * int readInt()
 * readLong() readDouble() readFloat()……
 */
public class O8RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("raf.dat","rw");
        long pos = raf.getFilePointer();
        System.out.println("pos:"+pos);

        int max = Integer.MAX_VALUE;
        raf.write(max>>>24);
        System.out.println("pos:"+raf.getFilePointer());
        raf.write(max>>>16);
        raf.write(max>>>8);
        raf.write(max);
        System.out.println("pos:"+raf.getFilePointer());

        raf.writeInt(max);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeLong(123L);
        raf.writeDouble(123.123);

        raf.seek(8);
        raf.writeLong(666);

        raf.close();

    }
}

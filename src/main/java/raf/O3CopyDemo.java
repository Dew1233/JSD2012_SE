package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class O3CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src =
                new RandomAccessFile("./music.mp3","r");

        RandomAccessFile desc =
                new RandomAccessFile("./music_cp.mp3","rw");
        int d = -1;

        long start = System.currentTimeMillis();
        while ((d=src.read())!=-1){
            desc.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！共耗时"+(end-start)+"ms");
        src.close();
        desc.close();
    }
}

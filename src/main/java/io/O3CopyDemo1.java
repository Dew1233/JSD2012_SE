package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class O3CopyDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("music.mp3");
        FileOutputStream fos = new FileOutputStream("music_cp.mp3");
        byte[] data = new byte[1024*100];
        int len = -1;
        while((len = fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        System.out.println("复制完毕！");
        fis.close();
        fos.close();
    }
}

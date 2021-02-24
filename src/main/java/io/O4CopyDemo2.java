package io;

import java.io.*;

public class O4CopyDemo2 {
    public static void main(String[] args) throws IOException {
       FileInputStream fis = new FileInputStream("music.mp3");
       BufferedInputStream bis = new BufferedInputStream(fis);
       FileOutputStream fos = new FileOutputStream("music_cp.mp3");
       BufferedOutputStream bos = new BufferedOutputStream(fos);
       int d = -1;
       long start = System.currentTimeMillis();
       while((d=bis.read())!=-1){
           bos.write(d);
       }
       long end = System.currentTimeMillis();
        System.out.println("一共耗时"+(end-start)+"ms");
        System.out.println("一共耗时"+(end-start)+"ms");
       bis.close();
       bos.close();
    }
}

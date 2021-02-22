package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class O10ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf  = new RandomAccessFile("user.dat","r");
       for (int i =0;i<raf.length()/100;i++){
           byte[] data = new byte[32];
           raf.read(data);
           String username = new String(data,"utf-8").trim();
           System.out.println("pos:"+raf.getFilePointer());

           raf.read(data);
           String password = new String(data,"utf-8").trim();
           System.out.println("pos:"+raf.getFilePointer());

           raf.read(data);
           String nickname = new String(data,"utf-8").trim();
           System.out.println("pos:"+raf.getFilePointer());

           int age = raf.readInt();
           System.out.println("pos:"+raf.getFilePointer());
           System.out.println(username+","+password+","+nickname+","+age);

       }
        raf.close();

    }
}

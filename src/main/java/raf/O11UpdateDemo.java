package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class O11UpdateDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();

        System.out.println("请输入新昵称：");
        String nickname = scanner.nextLine();

        RandomAccessFile raf =
                new RandomAccessFile("./user.dat","rw");

        boolean update = false;
        for (int i =0;i<raf.length()/100;i++){
            raf.seek(i*100);
            byte[] data = new byte[32];
            raf.read(data);
            String name = new String(data,"utf-8").trim();
            if(name.equals(username)){
                //32(用户名）32（密码） 32（昵称）4年龄
               raf.seek(i*100+64);
               data = nickname.getBytes("utf-8");
               data = Arrays.copyOf(data,32);
               raf.write(data);

               System.out.println("修改完毕");
               update=true;
               break;
               }

        }
        if (!update){
            System.out.println("查无此人");
        }
        raf.close();
    }
}

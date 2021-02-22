package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class O9RegDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("欢迎注册");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();

        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        System.out.println("请输入昵称：");
        String nickname = scanner.nextLine();

        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        System.out.println(username+","+password+","+nickname+","+age);


        RandomAccessFile raf =
                new RandomAccessFile("user.dat","rw");
        raf.seek(raf.length());
        byte[] data = username.getBytes("utf=8");
        raf.write(data);
        System.out.println("pos:"+raf.getFilePointer());

        data = password.getBytes("utf-8");
        raf.write(data);
        System.out.println("pos:"+raf.getFilePointer());

        data = nickname.getBytes("utf-8");
        raf.write(data);
        System.out.println("pos:"+raf.getFilePointer());

        raf.writeInt(age);
        System.out.println("pos:"+raf.getFilePointer());

        System.out.println("注册完毕！");
        raf.close();
    }
}

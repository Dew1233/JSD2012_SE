package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class O7Note {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名");
        String filename = scanner.nextLine();
        RandomAccessFile raf =
                new RandomAccessFile(filename,"rw");
        while (true){
            String line = scanner.nextLine();
            byte[] data = line.getBytes("utf-8");
            if ("exit".equals(line)){
                break;
            }
            raf.write(data);
        }

        System.out.println("再见");
        raf.close();
    }
}

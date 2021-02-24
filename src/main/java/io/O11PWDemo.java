package io;

import java.io.*;

/**
 * 低级流使用字符缓冲流 缓冲输出流
 */
public class O11PWDemo {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("pw.txt");
        OutputStreamWriter osw =
                new OutputStreamWriter(fos,"utf-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("你好！");
        pw.println("再见");
        System.out.println("写出完毕！");
        pw.close();
    }
}

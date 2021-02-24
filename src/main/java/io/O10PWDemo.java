package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 直接用字符缓冲流
 */
public class O10PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("pw.txt","utf-8");
        pw.println("夜空中的繁星点点");
        pw.println("正是因为月亮");
        System.out.println("写出完毕");
        pw.close();
    }
}

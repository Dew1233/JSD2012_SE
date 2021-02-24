package io;

import java.io.*;

public class O12BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =
                new FileInputStream("src/main/java/io/O12BRDemo.java");
        InputStreamReader isr =
                new InputStreamReader(fis);
        BufferedReader br =
                new BufferedReader(isr);
        String line = null;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}

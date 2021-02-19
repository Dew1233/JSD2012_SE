package file;

import java.io.File;

public class O4MKDirDemo {
    public static void main(String[] args) {
        File dir = new File("demo");
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("文件已经创建");
        }else {
            System.out.println("目录已存在！");
        }
    }
}

package file;

import java.io.File;

public class O5MkDirsDemo {
    public static void main(String[] args) {
        File dir = new File("a/b/c/d/e/f");
        if (!dir.exists()){
            dir.mkdirs();
            System.out.println("目录已经创建");
        }else{
            System.out.println("目录已经存在");
        }
    }
}

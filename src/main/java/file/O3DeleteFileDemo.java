package file;

import java.io.File;

/**
 * delete() 文件删除
 */

public class O3DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已经删除");
        }else{
            System.out.println("文件不存在");
        }
    }
}

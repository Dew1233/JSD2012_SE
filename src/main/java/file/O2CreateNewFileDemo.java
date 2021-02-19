package file;

import java.io.File;
import java.io.IOException;

public class O2CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        /**
         * boolean exists()判断当前File表示的路径下是否已经存在
         * 对应的文件或者目录
         * createNewFile创建一个新文件
         */
        if(!file.exists()){
            file.createNewFile();
            System.out.println("文件已经创建");
        }else{
            System.out.println("文件已经存在");
        }
    }
}

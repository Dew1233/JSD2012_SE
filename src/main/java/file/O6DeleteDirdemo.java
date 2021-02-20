package file;

import java.io.File;

public class O6DeleteDirdemo {
    public static void main(String[] args) {
        File dir = new File("./a");
        delete(dir);
    }

    public static void delete(File file){
        if(file.isDirectory()){
            /**
             * 首先清空目录
             * 1获取目录的所有子项
             * 2遍历每个子项逐个击破
             */
            File[] subs = file.listFiles();
            for (int i = 0;i<subs.length;i++){
                File sub = subs[i];
                delete(sub);
            }
        }
        file.delete();
    }
}

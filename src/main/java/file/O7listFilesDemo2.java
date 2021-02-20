package file;
/**
 * File [] listFiles(FileFilter filter)
 * 该方法在获取该目录中子项的过程中利用参数给定
 * 的过滤器将满足其要求的子项返回，其余的忽略
 */

import java.io.File;
import java.io.FileFilter;

public class O7listFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    System.out.println("正在过滤："+name);
                    return name.startsWith(".");
                }
            };
            File[] subs = dir.listFiles(filter);
            System.out.println(subs.length);
            for (int i =0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}

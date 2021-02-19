package file;

import java.io.File;

public class O1FileDemo {
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        /**
         * getname()：获取名字
         * length()：获取长度
         */
        String name = file.getName();
        long length = file.length();
    }
}

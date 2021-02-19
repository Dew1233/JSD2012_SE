package string;

public class O10StringDemo2 {
    public static void main(String[] args) {
        String str = "a";
        for (int i = 0;i<10000000;i++){
            str = str+"a";
        }
        System.out.println("程序结束了！");
    }
}
/**
 * 不断的新建一个String会在极端情况下造成内存溢出因此就使用StringBuilder
 *String对象不可变，频繁修改的过程其实是一个新建的过程
 */

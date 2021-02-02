package string;

/**
 * char charAt(int index)
 * 返回当前字符串指定位置的字符
 */

public class O5CharAtDemo {
    public static void main(String[] args) {
        String str = "helloworld";
        char c = str.charAt(7);
        System.out.println(c);//r
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

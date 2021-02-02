package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串，两个参数为下标
 * 【0，9）
 */
public class O4SubstringDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        String sub = str.substring(4,8);
        System.out.println(sub);//tedu

        sub = str.substring(4);
        System.out.println(sub);//tedu.cn

    }
}

package string;

/**
 * StringBuilder类
 * 维护一个可变长度的字符串
 * 本身不是字符串，而是提供字符串功能的API
 */
public class O11StringBuilderDemo2 {
    public static void main(String[] args) {
        String str = "a";
        StringBuilder builder = new StringBuilder(str);
        for (int i=0;i<1000000;i++){
            builder.append("a");
        }
        System.out.println("执行完毕！");
    }
}

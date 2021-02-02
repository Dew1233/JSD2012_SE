package string;

/**
 * 判断当前字符串是否以给定的内容开始或者结束
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 */
public class O8StartsWithDemo {
    public static void main(String[] args) {
        String str = "http://ww.tedu.cn";
        boolean starts = str.startsWith("http://");
        System.out.println(starts);

        boolean ends = str.endsWith(".cn");
        System.out.println(ends);
    }
}

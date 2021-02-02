package string;

/**
 * int indexof(String str)
 * 检索并返回给定字符串在当前字符串的位置，如果当前字符串
 * 不包括给定的内容时候，返回值为-1
 */
public class O3IndexOfDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        //检索第一次出现“in"的位置
        int index = str.indexOf("in");
        //检索从下标为3也就是第四个字符开始后第一次出现in的位置
        index = str.indexOf("in",3);
        //检索in在str中最后一次出现的位置
        index = str.lastIndexOf("in");
    }
}

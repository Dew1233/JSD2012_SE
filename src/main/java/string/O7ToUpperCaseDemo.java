package string;

/**
 * String toLowerCase()
 * String toUpperCase()
 * 将当前字符串的英文部分转换为全大写或全小写
 */
public class O7ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "你好java";
        String upper = str.toUpperCase();

        String lower = upper.toLowerCase();
//        验证码的比对
        String code = "AS4sh";
        String input = "as4sh";
        String c = code.toLowerCase();
        String i = input.toLowerCase();
        if(c.equals(i)){
            System.out.println("输入正确");
        }else {
            System.out.println("输入错误");
        }
    }
}

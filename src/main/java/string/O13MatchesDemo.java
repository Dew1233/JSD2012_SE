package string;

public class O13MatchesDemo {
    public static void main(String[] args) {
        String emial = "fancq@tedu.cn";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z])+";
        boolean match = emial.matches(regex);
        if(match){
            System.out.println("是邮箱");
        }else {
            System.out.println("不是邮箱");
        }
    }
}

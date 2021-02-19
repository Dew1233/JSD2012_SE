package string;

public class O15ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        str = str.replaceAll("[0-9]","#NUMBER");
        System.out.println(str);
    }
}

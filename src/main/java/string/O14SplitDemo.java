package string;

import java.util.Arrays;

public class O14SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

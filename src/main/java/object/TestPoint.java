package object;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        String str = p.toString();
        System.out.println(str);

        Point[] arr = {
                new Point(2,3),
                new Point(8,7),
                new Point(5,3),
                new Point(9,0)
        };
        String line = Arrays.toString(arr);
        System.out.println(line);
        Point p2 = new Point(1,2);
        System.out.println(p==p2);
        System.out.println(p.equals(p2));
    }
}

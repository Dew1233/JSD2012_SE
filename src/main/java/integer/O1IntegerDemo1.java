package integer;

public class O1IntegerDemo1 {
    public static void main(String[] args) {
        int d = 128;
        Integer i1 = Integer.valueOf(d);
        Integer i2 = Integer.valueOf(d);
        System.out.println(i1==i2);//false
        System.out.println(i1.equals(i2));//true

    }
}


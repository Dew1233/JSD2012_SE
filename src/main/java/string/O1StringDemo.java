package string;

/**
 * 字符串是不变的对象 一旦创建了内容就不可改变 如果要改就一定要创建新对象
 *
 */
public class O1StringDemo {
    public static void main(String[] args) {
        /*
        s1和s2是使用字面量形式创建的字符串对象 使用相同的字面量创建的字符串对象会被重用
         */
        String s1 = "123abc";
        String s2 = "123abc";
        System.out.println(s1==s2);//true 说明保存的地址是一样的 使用的同一个对象

        String s3 = new String("123abc");
        System.out.println(s2==s3);//flase 因为new一定要创建新对象

        System.out.println(s2.equals(s3));//true
    }
}

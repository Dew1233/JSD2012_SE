package homework;

public class testDemo01 {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }

}
class A{
    static {
        System.out.println("输出1");
    }
    public  A(){
        System.out.println("输出2");
    }

}

class B extends A{
    static {
        System.out.println("输出B");
    }

    public  B(){
        System.out.println("输出a");
    }
}

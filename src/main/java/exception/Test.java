package exception;

public class Test {
    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();
        a.eat();

        //向下转型
        Cat b = (Cat)a;
        b.catchMouse();

       // 向下转型
        if(a instanceof  Cat){
            Cat c = (Cat)a;
            c.catchMouse();
        }else if(a instanceof Dog){
            Dog d = (Dog)a;
            d.watchHouse();
        }
    }
}

package integer;
/**
 * 自动拆装箱
 * 使得编译期在编译期间补充代码完成基本类型与对应的包装类之间
 * 转换的代码，使得我们在编写源代码的时候可以在基本类型与引用类型之间直接赋值
 *
 */
public class O2IntegerDemo3 {
    public static void main(String[] args) {
        int a = 1;
        /**
         * 此处触发自动装箱特性  会被改为：
         * Integer i = Integer.valueOf(a);
         * 将基本类型转换为包装类
         */

        Integer i = a;
        a = i;//触发了自动拆箱特性 编译器会改为：a=i.intValue();将包装类转换为对应的基本类型

    }
}

package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 将给定对象通过对象流写出，此时对象流会将该对象转换为一组字节
 * 该过程为对象序列化
 */
public class O6OOSDemo {
    public static void main(String[] args) throws IOException {
       String name = "范传奇";
       int age = 17;
       String gender = "男";
       String [] otherInfo = {"编程老师","中国","达内"};
       Person p = new Person(name,age,gender,otherInfo);
       FileOutputStream fos = new FileOutputStream("person.obj");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(p);
        System.out.println("写出完毕");
        oos.close();
    }
}

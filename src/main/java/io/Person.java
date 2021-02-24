package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 对象输出流负责在写出对象的过程，将对象按照其结果转换为一组字节(对象序列化)
 * 对象输入流负责在读取对象的过程中，将字节还原为对象(对象反序列化)
 *
 * 想要序列化的前提条件，该对象所属的类必须实现序列化接口(Serializable)
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    private transient String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}

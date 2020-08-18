package com.javabase.serializable;

import java.io.Serializable;

/**
 * java序列化测试实体
 */
public class User implements Serializable {

    private String name;

    private String idCard;

    private String sex;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("User: {name: %s, idCard: %s, sex: %s, age: %d}", name, idCard, sex, age);
    }
}

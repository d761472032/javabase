package com.javabase.serializable;

import java.io.*;

public class Main {

    private static void serialize(User user) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("tmp.txt")));
        oos.writeObject(user);
        oos.close();
    }

    private static User deserialize() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("tmp.txt")));
        return (User) ois.readObject();
    }

    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("tyshawn");
        user.setAge(18);
        System.out.println("序列化前的结果: " + user);

        serialize(user);

        User dUser = deserialize();
        System.out.println("反序列化后的结果: "+ dUser);
    }

}

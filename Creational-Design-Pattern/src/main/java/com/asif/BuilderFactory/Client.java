package com.asif.BuilderFactory;

public class Client {

    public static void main(String[] args) {

        User user1 = new User.UserBuilder()
                .setEmail("asif@gmail.com")
                .setId(1)
                .setName("Asif")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder()
                .setEmail("radha@gmail.com")
                .setId(2)
                .build();

        System.out.println(user2);
    }
}

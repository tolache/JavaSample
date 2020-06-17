package com.example.helloworld;

public class Greetings {
    private Greetings() {}

    @Deprecated
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static String sayHi() {
        return "Hi, World!";
    }
}

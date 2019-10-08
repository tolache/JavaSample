package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        sayHello();
    }

    @Deprecated
    public static void sayHello() {
        System.out.println("Hello, World!");
    }
}

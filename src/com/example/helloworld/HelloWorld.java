package com.example.helloworld;

public class HelloWorld
{
    public static void main(String[] args)
    {
        sayHello();
        sayHi();
    }

    @Deprecated
    private static void sayHello()
    {
        System.out.println("Hello, World!");
    }

    private static void sayHi()
    {
        System.out.println("Hi, World 2!");
    }
}
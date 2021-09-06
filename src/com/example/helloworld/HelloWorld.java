package com.example.helloworld;

import static com.example.helloworld.Greetings.*;

public class HelloWorld
{
    public static void main(String[] args)
    {
        sayHello();
        System.out.println(sayHi());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
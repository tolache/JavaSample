package com.example.helloworld;

import org.junit.*;

import static org.hamcrest.CoreMatchers.containsString;

class GreetingsTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void containsText() {
        System.out.println("Test");
        String hi = Greetings.sayHi();
        Assert.assertThat(hi, containsString("Hi, World"));
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
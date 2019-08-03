package com.mycompany.app;

import org.testng.annotations.Test;

public class NewClassForTest {
    @Test(priority = 1)
    public void newClassForTestTest1() {
        System.out.println("NewClassForTest Test 1");
    }

    @Test
    public void newClassForTestTest2() {
        System.out.println("NewClassForTest Test 2");
    }

    @Test
    public void newClassForTestTest3() {
        System.out.println("NewClassForTest Test 3");
    }

    @Test
    public void newClassForTestTest4() {
        System.out.println("NewClassForTest Test 4");
    }
}

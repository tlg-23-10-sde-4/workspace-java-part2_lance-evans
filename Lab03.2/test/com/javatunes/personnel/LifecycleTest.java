package com.javatunes.personnel;

import org.junit.*;

class LifecycleTest {
    @Before
    public void beforeTest()  {
        System.out.println("Before test");
    }

    @After
    public void afterTest() {
        System.out.println("After test");
    }

    @BeforeClass
    public static void beforeTestRun() {
        System.out.println("Before test run");
    }

    @AfterClass
    public static void afterTestRun() {
        System.out.println("After test run");
    }

    @Test
    public void testSomething() {
        System.out.println("test Something");
    }

    @Test
    public void testSomethingElse() {
        System.out.println("test Something else");
    }
}
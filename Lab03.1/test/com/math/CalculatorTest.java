/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
  private Calculator calc;

  @BeforeClass
  public static void initializeTestRun(){
    System.out.println("initializeTestRun");
  }
  @AfterClass
  public static void finalizeTestRun(){
    System.out.println("finalizeTestRun");
  }
  @Before
  public void setUp(){
    System.out.println("setUp");
    calc = new Calculator();
  }
  @After
  public void tearDown(){
    System.out.println("tearDown");
  }

  @Test
  public void testAdd() {
    Calculator calc = new Calculator();
    assertEquals(5, calc.add(1, 4));  // expected, actual
  }
  @Test
  public void testDivide(){
    Calculator calc = new Calculator();
    assertEquals(5.0, calc.divide(10,2), 0);
  }
  @Test
  public void testEven(){
    Calculator calc = new Calculator();
    assertTrue(calc.isEven(4));
  }
}
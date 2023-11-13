/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.mytime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
  /**
   * main() calls each of the test methods in turn (currently commented out).
   * To run one test method at a time, uncomment the call to the one you want to execute.
   */
  public static void main(String[] args) {
    //testNow();
    //testCreate();
    //testParse();
    testFormat();
  }

  /**
   * TASK: create current date, time, and date-time via now() and then print them.
   */
  public static void testNow() {
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.printf("currentDate= %s; \ncurrentTime= %s;\ncurrentDateTime= %s", currentDate, currentTime, currentDateTime);
    // TODO
  }
  
  /**
   * TASK: implement the TODOs and print your results.
   */
  public void testCreate() {
    // TODO: create your birthday via of(). What day of the week were you born on?
    LocalDate bday = LocalDate.of(1992, 05, 30);
    DayOfWeek dayOfWeek = bday.getDayOfWeek();
        
    // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.
    // Note: ignore time-zone, just assume Eastern Time is the local time.
    LocalDate lunar = LocalDate.of(1969,7,20);
    System.out.printf("bday= %s\ndayOfWeek= %s\nlunar= %s", bday, dayOfWeek, lunar);
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testParse() {
    // TODO: create your birthday by parsing a text representation in standard format.
    LocalDate bday = LocalDate.parse("1992-05-30");
    // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
    LocalDate bdayFormatParse = LocalDate.parse("5/30/1992", DateTimeFormatter.ofPattern("M/d/yyyy"));
    System.out.printf("bday= %s\nbdayFormatParse= %s", bday, bdayFormatParse);
  }
  
  /**
   * TASK: create formatted display strings for the date below, in the specified formats.
   */
  public static void testFormat() {
    LocalDate hastings = LocalDate.of(1066, 10, 14);
    
    // TODO: 10/14/1066
    String formatSlash = hastings.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
    System.out.println(formatSlash);
    
    // TODO: 14-10-1066
    String formatDash = hastings.format(DateTimeFormatter.ofPattern("d-M-yyyy"));
    System.out.println(formatDash);
    
    // OPTIONAL: October 14, 1066
    String formatLong = hastings.format(DateTimeFormatter.ofPattern("MMMM dd yyyy"));
    System.out.println(formatLong);
  }
}
/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class RepeatingPrinterTest {

    public static void main(String[] args) {
        //Thread thd1 = new Thread(new RepeatingPrinter());
        //thd1.start();

        // initialize the 'printer' reference variable with a block lambda
        //Thread thd2 = new Thread(() -> System.out.println("lambda"));
        //thd2.start();
        // hint: you can copy / paste the *contents* of RepeatingPrinter's run() method
        // note: change the sysout to show "block-lambda"
        Runnable printer = null;

        // create another Thread, passing in the 'printer' reference as its Runnable - then start it
        Thread thd3 = new Thread(() -> {
            while (true) {
                System.out.println("lambda as the Runnable");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        thd3.start();
    }
}
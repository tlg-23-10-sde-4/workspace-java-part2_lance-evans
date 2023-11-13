/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

    public static void main(String[] args) {
        MessagePrinter m1 = new MessagePrinter("Roses are red");
        MessagePrinter m2 = new MessagePrinter("Violets are blue");
        MessagePrinter m3 = new MessagePrinter("I dont care");
        MessagePrinter m4 = new MessagePrinter("and neither should you");

        m1.setCount(10);
        m1.setInterval(1500);
        m2.setCount(20);
        m2.setInterval(50);
        m3.setCount(15);
        m3.setInterval(1200);
        m4.setCount(25);
        m4.setInterval(10);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        // create two instances of your thread subclass and start them up
    }
}
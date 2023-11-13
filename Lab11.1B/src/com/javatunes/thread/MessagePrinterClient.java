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
        MessagePrinter m1 = new MessagePrinter("Roses are red", 30, 1000);
        MessagePrinter m2 = new MessagePrinter("Violets are blue", 30, 500);
        MessagePrinter m3 = new MessagePrinter("I dont care", 30, 100);
        MessagePrinter m4 = new MessagePrinter("and neither should you", 30, 2000);

        Thread thd = new Thread(m1, "message-printer-1");
        Thread thd1 = new Thread(m2, "message-printer-2");
        Thread thd2 = new Thread(m3,"message-printer-3");
        Thread thd3 = new Thread(m4, "message-printer-4");

        thd.start();
        thd1.start();
        thd2.start();
        thd3.start();
        // create two instances of your thread subclass and start them up
    }
}
/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

// TODO: extend the Thread class
public class MessagePrinter implements Runnable {
    private static final String threadPrefix = "message-printer";
    private static int id = 0;

    private final String message;
    private int count;
    private long interval;

    public MessagePrinter(String message, int count, long interval) {
        this.message = message;
        this.count = count;
        this.interval = interval;
        //Thread.currentThread().setName(threadPrefix+ ++id);
        // set the thread name [important when debugging]
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    /**
     * implement run() as follows:
     * It should loop 10 times, printing the 'message' field to stdout,
     * then pausing for some interval (in millis) that you choose.
     * <p>
     * Use a try/catch to call Thread.sleep(interval) for the pause.
     * The sleep() method throws InterruptedException, which you need to catch.
     * You can either leave the catch block empty, or print the exception to stdout.
     */


  @Override
    public void run() {

        for (int i = 0; i <= count; i++) {
          System.out.println(Thread.currentThread().getName()+": " + message);
        }
        try {
          Thread.sleep(interval);
        }
        catch (InterruptedException ignored){}
    }
}
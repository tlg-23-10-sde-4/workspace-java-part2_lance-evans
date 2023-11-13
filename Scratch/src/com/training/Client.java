package com.training;

class Client {
    public static void main(String[] args) {
        //classloader loads Instructor.class which initializes that static (shared) Projector object
        //Instructor inst1 = new Instructor("Lance", 1);
        //Instructor inst2 = new Instructor("BL", 2);
        Instructor.touch();
        Instructor.touch();
    }
}
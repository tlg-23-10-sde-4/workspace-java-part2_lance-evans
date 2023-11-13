package com.training;

class Instructor {

    //Shared among all Instructor objects
    private static Projector projector = new Projector();

    // instance variables for each Instructor object
    private final String name;
    private final int yearsOfExperience;

    public Instructor(String name, int yearsOfExperience){
        System.out.println("Instructor ctor called");
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public static void touch() {
        System.out.println("Intstructors touch() method called");
    }

    public String getName() {
        return name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    static {
        System.out.println("Static fields initialized: Instructor.class loaded into memory");
    }
}
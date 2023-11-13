package com.training;

class Projector {

    public Projector(){
        System.out.println("Projector ctor called");
    }

    //this executes when the class loader loads Projector.class into memory
    static {
        System.out.println("Projector.class loaded into memory");
    }
}
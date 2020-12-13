package com.codewithudemy;

public class Dog extends  Animal {

    boolean isBarking = true;
    public Dog(String Animal, String color,boolean isBarking) {
        super(Animal, color);
        this.isBarking = isBarking;
    }
}

package com.codewithudemy;

public class Fish extends Animal {
    boolean isSwimming ;
    public Fish(String animal, String color) {
        super(animal, color);
    }
    //overriding a methode  walk methode from animal in order to modify cause fish cant walk
    //shot cut name of the methode plus enter key

    @Override
    public void walk() {
        super.walk();// first we are calling from the base class
        System.out.println(" Fish cant walk ");
    }
}

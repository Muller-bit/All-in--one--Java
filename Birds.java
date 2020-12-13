package com.codewithudemy;

public class Birds extends Animal{

    int flyingSpeed;

    public Birds(String animal, String color,int speed) {
        super(animal, color);
        flyingSpeed = speed;
    }
}

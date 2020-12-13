package com.codewithudemy;

public class Animal {
    //fields or attribute
    String  animalName;
    String animalColor;


    public Animal(String Animal,String color){
        this.animalColor = color;
        this.animalName = Animal;
    }

    public void walk(){
        System.out.println( animalName + " "  + "is walking ");
    }
}

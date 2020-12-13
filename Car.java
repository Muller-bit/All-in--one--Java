package com.codewithudemy;

import java.util.ArrayList;

    public class Car {
    //working with classes  and objects

    String color;
    String brand;
    int velocity;
    String model;

    public Car(String carColor, String brandName, int carVelocity, String carModel){
        color = carColor;
        brand = brandName;
        velocity= carVelocity;
        model= carModel;

    }
     public void carIsSold(){
         System.out.println( brand + " just  sold");
     }

     public void letsDrive(){
        System.out.println( " im driving " + brand);
    }

    public void letStop(){
        System.out.println( " I want to stop driving");
    }

}

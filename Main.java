package com.codewithudemy;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*here we go for comments
        String weather = "Raining";
        boolean  isColorful = true;
        boolean isScreenBig = false;
        if(isColorful )
        if(weather.equals("Raining")){
            System.out.println(" I am carrying my umbrella ");
        } else{
            System.out.println(" I don't need un umbrella ");

    // Logical operators &&  ||     }

   // Working with ARRAY

        //String[] shopingList = {"Milk ","Sugar","Banana","snacks"};
                        //   0       1        2         3
        System.out.println(shopingList[2]);

        ArrayList<String>arrayListShopingItem = new ArrayList<>();
        arrayListShopingItem.add("Mango");
        arrayListShopingItem.add("Avocado");
        arrayListShopingItem.add("Pasta");
        System.out.println(arrayListShopingItem);

        // WORKING WITH LOOPS
        // LOOPS ARE USEFUL TO EXECUTE THE TASK WILL NE DONE CONTINOUSLY AND
        /*WILL BE IMPLEMNTED UNTILL CERTAIN CONDITION MEET

        int count = 0;
        while( count < 10){
            System.out.println( " Hi there");
             count ++;

        }
        for(  int counter = 0; counter < 5; counter++){ // code snipet for + Tab Tab

          //  System.out.println("No pain no gain ");

        }
        // the of use of oop
        Car myCar1 = new Car("blue", "ferari", 120, "mercedesbenze");
        Car myCar2 = new Car("blue", "Audi", 120, "mercedesbenze");
        Car myCar3 = new Car("blue", "Toyota", 120, "mercedesbenze");
        Car myCar4 = new Car("blue", "Nissan", 120, "mercedesbenze");
        Car myCar5 = new Car("blue", "Bugati", 120, "mercedesbenze");

        ArrayList<Car> myCars = new ArrayList<>();  // creating an array of list of Car

        myCars.add(myCar1);
        myCars.add(myCar2);
        myCars.add(myCar3);
        myCars.add(myCar4);
        myCars.add(myCar5);

         for(  Car car : myCars){

            car.carIsSold();
        }


           System.out.println(myCar1.color);

           System.out.println(myCar2.brand + " is my favorite car brand");


       //Working with access modifier

        BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.setAmountAvailable(9999));
         */
        Animal dog = new Animal("Max", "black");
        dog.walk();

        Dog dog1 = new Dog("papi","brown",true);// inherited or shared code
        dog1.walk();

        Fish fish = new Fish("Catfish ","dark-blue");
        fish.walk();

        Birds bird = new Birds("parrot","green",120);
        Animal mydog = new Dog("jo","black",true);









    }
}

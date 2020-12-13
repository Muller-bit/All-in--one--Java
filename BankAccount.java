package com.codewithudemy;

public class BankAccount {
    // working with Access modifiers , public ,private,default,protected

    private int amountAvailable = 0;

    public int setAmountAvailable(int amount)
    {
        if(amount >1000){
            System.out.println("you can,t deposit that much money");
        }
        else {
            this.amountAvailable = amount;

        }


        return amount;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }
}

package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese = false;
    private boolean extraToppingsForVeg = false;
    private boolean isExtraToppingsForNonVeg = false;
    private boolean bagData = false;
    final int vegPizza  = 300;
    final int nonVegPizza = 400;
    final int extraCheesePrice = 80;
    final int extraToppingsVegPrice = 70;
    final int extraToppingsNonvegPrice = 10;
    final int bag = 20;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price =400;

        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese){
            this.price += extraCheesePrice;
            extraCheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsForVeg && isVeg){
            this.price += extraToppingsVegPrice;
            extraToppingsForVeg = true;
            extraCheese = true;
        }
        else if(!extraToppingsForVeg && !isVeg){
            this.price += extraToppingsNonvegPrice;
            isExtraToppingsForNonVeg = true;
            extraCheese = true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!bagData){
            bagData = true;
            this.price += bag;

        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            this.bill += "Base Price Of The Pizza: " + vegPizza+"\n";
        }
        else{
            this.bill += "Base Price Of The Pizza: "+ nonVegPizza+"\n";

        }
        if(extraCheese){
            this.bill += "Extra Cheese Added: "+ extraCheesePrice+"\n";
        }
        if(extraToppingsForVeg && isVeg){
            this.bill +="Extra Toppings Added: "+extraToppingsVegPrice+"\n";
        }
        else if(isExtraToppingsForNonVeg && !isVeg){
            this.bill +="Extra Toppings Added: "+extraToppingsNonvegPrice+"\n";
        }
        if(bagData){
            this.bill += "Paperbag Added: "+ bag +"\n";
        }
        this.bill += "Total Price: "+price;
        return this.bill;
    }
}

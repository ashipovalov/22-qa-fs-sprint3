package ru.practicum.model;

public class Food {
    protected int amount;
    protected double price;
    protected boolean isVegeterian;

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }



    public Food(int amount, double price, boolean isVegeterian) {
        this.amount = amount;
        this.price = price;
        this.isVegeterian = isVegeterian;
    }



    public double getDiscount(){
        return 0;
    };




}

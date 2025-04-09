package ru.practicum.service;

import ru.practicum.model.Food;

public class ShoppingCart {

    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }


    public double getVegTotalAmountWithoutDiscount() {
        double totalPrice = 0.0;
        for (Food item : items) {
            if (item.isVegeterian()){
                totalPrice += item.getPrice() * item.getAmount();
            }
        } return totalPrice;
    }
}
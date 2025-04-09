package ru.practicum.model;

import ru.practicum.model.constants.Colour;

public class Apple extends Food {
    public String colour;


    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }


    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return 0.6;
        } else {
        return 0;
    } }
}

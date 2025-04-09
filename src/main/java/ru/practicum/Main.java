package ru.practicum;

import ru.practicum.model.Apple;
import ru.practicum.model.Food;
import ru.practicum.model.Meat;
import ru.practicum.model.constants.Colour;
import ru.practicum.service.ShoppingCart;

public class Main {

    public static void main(String[] args) {


        ShoppingCart cart = new ShoppingCart(new Food[]{new Meat(5, 100),
                new Apple(8, 50, Colour.RED),
                new Apple(8, 60, Colour.GREEN)
        });

        System.out.println("Сумма всех вегетарианских товаров без скидки + " + cart.getVegTotalAmountWithoutDiscount());


    }

}
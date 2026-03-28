package model.service;

import model.Food;

public class ShoppingCart {
    Food[] objectCart;

    public ShoppingCart(Food[] object) {
        this.objectCart = object;
    }

    public double totalAmountNoDiscount() {
        double totalSum = 0;
            for (int i = 0; i < objectCart.length; i++) {
                Food item = objectCart[i];
                totalSum = totalSum + item.getAmount() * item.getPrice();
        }
        return totalSum;
    }

    public double totalAmountDiscount() {
        double totalSum = 0;
            for (int i = 0; i < objectCart.length; i++) {
                Food item = objectCart[i];
                double itemPrice = item.getAmount() * item.getPrice();
                double discount = item.getDiscount();
                totalSum = totalSum + itemPrice * (1 - discount / 100);
        }
        return totalSum;
    }

    public double totalAmountVegNoDiscount() {
        double totalSum = 0;
        for (int i = 0; i < objectCart.length; i++) {
            Food item = objectCart[i];
            if (item != null && item.isVegetarian()) {
                totalSum = totalSum + item.getAmount() * item.getPrice();
            }
        }
        return totalSum;

    }
}

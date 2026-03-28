import model.*;

import model.Meat;
import model.service.ShoppingCart;


public class Main {

    public static void main(String[] args) {

        Meat meat = new Meat(5, 100.0);
        Apple appleRed = new Apple(10, 50.0, "Red");
        Apple appleGreen = new Apple(8, 60.0, "Green");

        Food[] odjectCart = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(odjectCart);

        System.out.println("Общая сумма товаров без скидки: "
                + cart.totalAmountNoDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: "
                + cart.totalAmountDiscount() + " руб.");
        System.out.println("Общая сумма вегетарианских товаров без скидки: "
                + cart.totalAmountVegNoDiscount() + " руб.");
    }
}

package com.kodilla.good.patterns.challenges;

public class ShopMain {
    public static void main(String[] args) {
        User user = new User("Filip");
        Product games = new Games("The Witcher", "Adventures", 18);
        Location location = new Location("Warsaw", "Gdansk");
        DateOrder dateOrder = new DateOrder();

        ProductOrderProcess productOrderProcess = new ProductOrderProcess();
        productOrderProcess.orderProduct(user, games, location, dateOrder.getDateNow());
    }
}

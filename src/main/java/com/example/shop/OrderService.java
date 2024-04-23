package com.example.shop;

public class OrderService {
    public void makeOrder(Cart cart) {
        double totalCost = 0;
        System.out.println("зАКАЗ:");

        for (Product product : cart.cartItems) {
            totalCost += product.cost;
            System.out.println(product.id + " " + product.name + " " + product.cost);
        }

        System.out.println("стоимость: " + totalCost);
    }
}
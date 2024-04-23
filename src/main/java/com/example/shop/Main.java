package com.example.shop;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.AllProducts();
        Cart cart = new Cart();

        OrderService orderService = new OrderService();
        orderService.makeOrder(cart);
    }
}
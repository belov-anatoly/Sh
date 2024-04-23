package com.example.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Кампуктер", 1000.0));
        products.add(new Product(2, "Телефончик", 800.0));
        products.add(new Product(3, "Наушнички", 580.0));

    }

    public void AllProducts() {
        for (Product product : products) {
            System.out.println(product.id +" " + product.name + " "+ product.cost);
        }
    }

    public Product findByName(String productName) {
        for (Product product : products) {
            if (product.name.equals(productName)) {
                return product;
            }
        }
        return null;
    }
}

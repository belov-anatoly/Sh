package com.example.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "А", 100.0));
        products.add(new Product(2, "Б", 80.0));
        products.add(new Product(3, "В", 5.0));

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

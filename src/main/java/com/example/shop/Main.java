//"Магазин"
//
//        1) создать класс Product
//
//        с аттрибутами id, name, cost
//
//        2) создать КОМПОНЕНТ ProductService, содержащая список товаров
//
//        после инициализации в ней сразу должно быть 10 каких-нибудь товаров
//
//        метод вывода всех товаров в консоль
//
//        метод поиска товара (получить ссылку на Product) по названию
//
//        3) создать компонент Корзина
//
//        с методом добавления товара
//
//        4) создать компонент OrderService, позволяющая из корзины сделать заказ
//
//        метод сделатьЗаказ выводит в консоль список всех позиций и суммарную стоимость
//
//        в основном классе загрузить контекст, содержащий 3 бина
//
//        с бином productService показать работу метода вывода
//
//        найти 1 товар по названию и положить в корзину
//
//        найти 2й товар по названию и положить в корзину
//
//        сформировать заказ

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
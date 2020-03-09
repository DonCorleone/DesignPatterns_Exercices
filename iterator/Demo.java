package com.codewithmosh.iterator;
/**
 * Demo
 */
public class Demo {

    public static void show() {
        var products = new ProductCollection();
        products.add(new Product(1, "A"));
        products.add(new Product(2, "B"));
        products.add(new Product(3, "C"));

        Iterator<Product> iterator = products.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
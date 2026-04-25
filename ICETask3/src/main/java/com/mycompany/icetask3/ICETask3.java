/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask3;

/**
 *
 * @author Student
 */
// Abstract class Product
abstract class Product {
    protected String name;
    protected double price; // price in Rands

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    public abstract double getDiscountedPrice();
}

// Clothing subclass – 10% discount
class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return price * 0.90; // 10% off
    }
}

// Electronics subclass – 5% discount
class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return price * 0.95; // 5% off
    }
}

// Main class – must match the project name
public class ICETask3 {
    public static void main(String[] args) {
        // Create an array of 5 products
        Product[] products = new Product[5];
        
        // Adding 5 products (mix of Clothing and Electronics)
        products[0] = new Clothing("Summer T-Shirt", 250.00);
        products[1] = new Electronics("Wireless Mouse", 400.00);
        products[2] = new Clothing("Winter Jacket", 1200.00);
        products[3] = new Electronics("Smartphone Case", 150.00);
        products[4] = new Clothing("Running Shorts", 180.00);
        
        // Print original and discounted prices
        System.out.println("Discounted prices (in Rands):");
        for (Product p : products) {
            double discounted = p.getDiscountedPrice();
            System.out.printf("%s: Original R%.2f -> Discounted R%.2f%n",
                              p.name, p.price, discounted);
        }
    }
}
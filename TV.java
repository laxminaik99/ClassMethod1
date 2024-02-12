package com.bridgelabz9;

public class TV {
    // Instance variables
    private String brand;
    private int size;
    private double price;

    // Constructor
    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    // Method to calculate the discount of the TV based on its size
    public double calculateDiscount() {
        double discountPercentage;

        // Determine discount percentage based on TV size
        if (size < 32) {
            discountPercentage = 0; // No discount for TVs less than 32 inches
        } else if (size >= 32 && size <= 50) {
            discountPercentage = 5; // 5% discount for TVs between 32 and 50 inches
        } else {
            discountPercentage = 10; // 10% discount for TVs larger than 50 inches
        }

        // Calculate discounted price
        double discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }

    // Method to print TV's brand, size, and discounted price
    public void printTVDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Discounted Price: $" + calculateDiscount());
    }

    public static void main(String[] args) {
        // Creating a TV object
        TV myTV = new TV("Samsung", 55, 1000);

        // Printing the TV's details
        myTV.printTVDetails();
    }
}

package com.bridgelabz9;

public class Furniture {
    // Instance variables
    private String type;
    private String material;
    private double price;

    // Constructor
    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    // Method to calculate the discount of the furniture
    public double calculateDiscount() {
        // Pricing logic based on type, material, and price
        // This is just a placeholder, actual pricing logic can be more complex
        double discountPercentage = 0;
        if (type.equalsIgnoreCase("chair")) {
            discountPercentage += 5; // 5% discount for chairs
        } else if (type.equalsIgnoreCase("table")) {
            discountPercentage += 10; // 10% discount for tables
        }

        if (material.equalsIgnoreCase("wood")) {
            discountPercentage += 5; // 5% discount for wood material
        } else if (material.equalsIgnoreCase("metal")) {
            discountPercentage += 10; // 10% discount for metal material
        }

        // Apply additional discount based on price
        if (price > 1000) {
            discountPercentage += 5; // Additional 5% discount for price above $1000
        }

        // Calculate discounted price
        double discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }

    // Method to print furniture's type, material, and discounted price
    public void printFurnitureDetails() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Discounted Price: $" + calculateDiscount());
    }

    public static void main(String[] args) {
        // Creating a Furniture object
        Furniture chair = new Furniture("Chair", "Wood", 150);

        // Printing the furniture's details
        chair.printFurnitureDetails();
    }
}

package com.bridgelabz9;

public class Shirt {
    // Instance variables
    private String size;
    private String color;
    private double price;

    // Constructor
    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    // Method to calculate the discount on the shirt based on size, color, and price
    public double calculateDiscount() {
        // Pricing logic based on size, color, and price
        // This is just a placeholder, actual pricing logic can be more complex
        double discountPercentage = 0;
        if (size.equalsIgnoreCase("small")) {
            discountPercentage += 5; // 5% discount for small size
        } else if (size.equalsIgnoreCase("medium")) {
            discountPercentage += 10; // 10% discount for medium size
        } else if (size.equalsIgnoreCase("large")) {
            discountPercentage += 15; // 15% discount for large size
        }

        if (color.equalsIgnoreCase("red")) {
            discountPercentage += 5; // 5% discount for red color
        } else if (color.equalsIgnoreCase("blue")) {
            discountPercentage += 10; // 10% discount for blue color
        }

        // Apply additional discount based on price
        if (price > 50) {
            discountPercentage += 5; // Additional 5% discount for price above $50
        }

        // Calculate discounted price
        double discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }

    // Method to calculate the discount on the shirt based on size only
    public double calculateDiscountBySize() {
        // Pricing logic based on size only
        double discountPercentage = 0;
        if (size.equalsIgnoreCase("small")) {
            discountPercentage = 5; // 5% discount for small size
        } else if (size.equalsIgnoreCase("medium")) {
            discountPercentage = 10; // 10% discount for medium size
        } else if (size.equalsIgnoreCase("large")) {
            discountPercentage = 15; // 15% discount for large size
        }

        // Calculate discounted price based on size only
        double discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }

    // Method to print the shirt's size, color, and discounted price
    public void printShirtDetails() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Discounted Price: $" + calculateDiscount());
    }

    public static void main(String[] args) {
        // Creating a Shirt object
        Shirt myShirt = new Shirt("Medium", "Red", 60);

        // Printing the shirt's details
        myShirt.printShirtDetails();
    }
}

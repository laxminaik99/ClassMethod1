package com.bridgelabz9;

public class Phone {
    // Instance variables
    private String make;
    private String model;
    private int storage;

    // Constructor
    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    // Method to calculate the price of the phone
    public double calculatePrice() {
        // Pricing logic based on make, model, and storage
        // This is just a placeholder, actual pricing logic can be more complex
        double basePrice = 300; // Base price for all phones
        double storagePrice = storage * 10; // $10 per GB
        double modelPrice = 0;

        // Adjust price based on model
        switch (model.toLowerCase()) {
            case "basic":
                modelPrice = 100;
                break;
            case "standard":
                modelPrice = 200;
                break;
            case "premium":
                modelPrice = 300;
                break;
            default:
                System.out.println("Invalid model. Using default price.");
                break;
        }

        // Total price calculation
        double totalPrice = basePrice + storagePrice + modelPrice;
        return totalPrice;
    }

    // Method to print phone's make, model, and storage
    public void printPhoneDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        // Creating a Phone object
        Phone myPhone = new Phone("Apple", "Premium", 128);

        // Printing the phone's details
        myPhone.printPhoneDetails();

        // Calculating and printing the price of the phone
        System.out.println("Price: $" + myPhone.calculatePrice());
    }
}

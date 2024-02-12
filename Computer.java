package com.bridgelabz9;

public class Computer {
    // Instance variables
    private String processor;
    private int ram; // in GB
    private int storage; // in GB

    // Constructor
    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    // Method to calculate the price of the computer
    public double calculatePrice() {
        // Pricing logic based on processor, RAM, and storage
        // This is just a placeholder, actual pricing logic can be more complex
        double basePrice = 500; // Base price for all computers
        double processorPrice = 0;
        double ramPrice = ram * 10; // $10 per GB of RAM
        double storagePrice = storage * 0.5; // $0.50 per GB of storage

        // Adjust price based on processor
        switch (processor.toLowerCase()) {
            case "i3":
                processorPrice = 200;
                break;
            case "i5":
                processorPrice = 300;
                break;
            case "i7":
                processorPrice = 400;
                break;
            default:
                System.out.println("Invalid processor. Using default price.");
                break;
        }

        // Total price calculation
        double totalPrice = basePrice + processorPrice + ramPrice + storagePrice;
        return totalPrice;
    }

    // Method to print computer's processor, RAM, and storage
    public void printComputerDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        // Creating a Computer object
        Computer myComputer = new Computer("i5", 8, 512);

        // Printing the computer's details
        myComputer.printComputerDetails();

        // Calculating and printing the price of the computer
        System.out.println("Price: $" + myComputer.calculatePrice());
    }
}

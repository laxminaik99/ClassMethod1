package com.bridgelabz9;

public class Dog {
    // Instance variables
    private String breed;
    private int age;
    private double weight;

    // Constructor
    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    // Method to calculate dog's age in human years
    public int calculateAgeInHumanYears() {
        int humanAge;
        if (age <= 2) {
            humanAge = age * 11; // Dogs age faster in the first two years
        } else {
            humanAge = 22 + ((age - 2) * 5); // After two years, each dog year is equivalent to 5 human years
        }
        return humanAge;
    }

    // Method to print dog's breed, age, and weight
    public void printDogDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years (Human years: " + calculateAgeInHumanYears() + ")");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        // Creating a Dog object
        Dog myDog = new Dog("Labrador Retriever", 3, 25.5);

        // Printing the dog's details
        myDog.printDogDetails();
    }
}

package com.bridgelabz9;

public class Circle {
    // Instance variable
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Creating a Circlee object with radius 5
        Circle circle = new Circle(5);

        // Calculating and printing the area and circumference
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
    }
}

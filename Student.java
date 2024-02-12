package com.bridgelabz9;

public class Student {
    // Instance variables
    private String name;
    private int age;
    private int id;

    // Constructor
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Method to print name and age
    public void printNameAndAge() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("John", 20, 1001);

        // Calling the method to print name and age
        student1.printNameAndAge();
    }
}

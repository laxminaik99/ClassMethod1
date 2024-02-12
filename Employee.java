package com.bridgelabz9;
import java.util.*;

//public class Employee {
//	private String name;
//	private int salary;
//	private int id;
//	
//	  public Employee(String name, int salary, int id) {
//	        this.name = name;
//	        this.salary = salary;
//	        this.id = id;
//	    }
//	  public  int calculate() {
//		  int sal= 12*salary;
//		  return sal;
//	  }
//	  
//	  public void print() {
//		   System.out.println("Name: " + name);
//	       
//	  }
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		Employee emp=new Employee("Ram",12000,2);
//		emp.print();
//		System.out.println("salary: " + emp.calculate());
//
//	}
//
//}

public class Employee {
    // Instance variables
    private String name;
    private double salary;
    private int id;

    // Constructor
    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return salary * 12;
    }

    // Method to print name and salary
    public void printNameAndSalary() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee("Alice", 50000, 1001);

        // Calling methods to calculate yearly salary and print name and salary
        System.out.println("Yearly Salary: $" + employee1.calculateYearlySalary());
        employee1.printNameAndSalary();
    }
}


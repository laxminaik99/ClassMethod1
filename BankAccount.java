package com.bridgelabz9;

public class BankAccount {
    // Instance variables
    private double balance;
    private String accountNumber;

    // Constructor
    public BankAccount(String accountNumber) {
        this.balance = 0.0; // Initialize balance to zero
        this.accountNumber = accountNumber;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("1234567890");

        // Depositing and withdrawing money
        account.deposit(1000);
        account.withdraw(500);
        account.deposit(200);
        account.withdraw(1500);

        // Printing the current balance
        System.out.println("Current Balance: $" + account.getBalance());
    }
}

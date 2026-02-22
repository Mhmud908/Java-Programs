package BankingSystem.src.model;

import BankingSystem.src.exception.InsufficientBalanceException;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }else {
            System.out.println("Deposit amount must be positive.");
        }
    }

public void withdraw(double amount) throws InsufficientBalanceException {

    if (amount <= 0)
        throw new IllegalArgumentException("Amount must be positive.");

    if (amount > balance)
        throw new InsufficientBalanceException("Insufficient balance.");

    balance -= amount;
}


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    
    
}

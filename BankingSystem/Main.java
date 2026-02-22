package BankingSystem;

import BankingSystem.src.exception.InsufficientBalanceException;
import BankingSystem.src.service.BankService;
import BankingSystem.src.model.BankAccount;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Banking System!");

       Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService();

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Add Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // ADD ACCOUNT
                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();

                    BankAccount account = new BankAccount(name, accountNumber, balance);
                    bankService.addAccount(account);

                    System.out.println("Account added successfully.");
                    break;

                case 2:
                    // VIEW ACCOUNT
                    scanner.nextLine();

                    System.out.print("Enter Account Number: ");
                    String searchAcc = scanner.nextLine();

                    BankAccount found = bankService.findAccount(searchAcc);

                    if (found != null) {
                        found.displayAccountInfo();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    // DEPOSIT
                    scanner.nextLine();

                    System.out.print("Enter Account Number: ");
                    String depAcc = scanner.nextLine();

                    System.out.print("Enter Amount: ");
                    double depAmount = scanner.nextDouble();

                    bankService.deposit(depAcc, depAmount);
                    System.out.println("Deposit successful.");
                    break;

                case 4:
                    // WITHDRAW
                    scanner.nextLine();

                    System.out.print("Enter Account Number: ");
                    String witAcc = scanner.nextLine();

                    System.out.print("Enter Amount: ");
                    double witAmount = scanner.nextDouble();

                    try {
                        bankService.withdraw(witAcc, witAmount);
                        System.out.println("Withdrawal successful.");
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
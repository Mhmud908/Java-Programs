package BankingSystem.src.service;

import java.util.ArrayList;

import BankingSystem.src.model.BankAccount;

public class BankService {

    private ArrayList<BankAccount> accounts;

    int totalTransactions;

    public BankService() {
        accounts = new ArrayList<>();
        totalTransactions = 0;

    }
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
    
        public BankAccount findAccount(String accountNumber) {
            
            for (BankAccount account : accounts) {
                if (accountNumber.equals(account.getAccountNumber())) {
                    return account;
                }
            }
            return null;
        }

        public void deposit(String accountNumber, double amount) {
            BankAccount account = findAccount(accountNumber);
            if(account != null){
                account.deposit(amount);
                totalTransactions++;
            }else{
                System.out.println("Account not found.");
            }
        }

        
        public void withdraw(String accountNumber, double amount){

            BankAccount account = findAccount(accountNumber);
            if(account != null){
                if(amount <= account.getBalance()){
                    account.withdraw(amount);
                    totalTransactions++;
                }
                else{
                    System.out.println("Insufficient funds.");
                }
            }else{
                System.out.println("Account not found.");
            }
            
        }

    
}
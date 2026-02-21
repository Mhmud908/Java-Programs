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
    
        public BankAccount findAccount(int accountNumber) {
            
            for (BankAccount account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    return account;
                }
            }

    
}
}
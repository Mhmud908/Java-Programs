package BankingSystem.src.util;

public class InterestCalculator {

    public static double calculateCoumpoundInterest( double principal, double rate, int years){
        if(years == 0){
            return principal;
        }

        return calculateCoumpoundInterest(principal, rate, years - 1) * (1 + rate / 100);
    }
    
}

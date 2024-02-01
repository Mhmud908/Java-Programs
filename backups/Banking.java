import java.util.*;
import java.util.Scanner;


class Account{

	int accNo;
	String name;
	float amount;
	
	Account(int accountNo, String accHoName, float tAmount){
	
		accNo = accountNo;
		name = accHoName;
		amount = tAmount;
	}
	
	void menu()
	
void display(){
	
		System.out.println(accNo+"\t\t\t"+name+"\t\t\t"+amount);
	}
	
	void deposit(float amt){
	
		amount = amount+amt;
		System.out.println(amt+" Rupees Successfully Deposited");
	}
	
	void withdraw(float amt){
	
		if(amount<amt){
		
			System.out.println("Insaficient Funds");
		}else{
		
			amount = amount-amt;
			System.out.println(amt+" Rupees Successfully Withdrawn");
		}
		
	}
	
	void checkBalance(){
	
		System.out.println("Balance is "+amount);
	}
}
public class Banking {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account(12262, "Mehmood", 6400000);
		a1.display();
		a1.deposit(600000);
		a1.checkBalance();
		a1.withdraw(100);
		a1.checkBalance();
		
		System.out.println("Login to Your Account");
		String uName="mehmood658";
		String uPass="Mehmood$658";
		
		String userName, password;
		System.out.print("\t\t\t\tUsername");
		userName = sc.next();
		System.out.print("\n\t\t\t\t Password");
		password = sc.next();
		
		if (userName.compareTo(uName)==0 && password.compareTo(uPass)==0){
		
			
		}
		
}
}
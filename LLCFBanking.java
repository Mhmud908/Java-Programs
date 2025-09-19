import java.util.LinkedList;
import java.util.Scanner;
class BankCustomer{
				Scanner userInput = new Scanner(System.in);
				String name;
				double balance;
				BankCustomer(String name, double balance){
								this.name = name;
								this.balance = balance;
				}
				
				public void delay(int duration){
								try{
												Thread.sleep(duration);
								}catch(InterruptedException e){
												e.printStackTrace();
								}
				}
				
				public void loadingDelay(int duration){
								System.out.println("Loading...");
								try{
												Thread.sleep(duration);
								}catch(InterruptedException e){
												e.printStackTrace();
								}
								clearScr();
								System.out.println("Done!");
								delay(800);
				}
				
				////Clear Screen
				public void clearScr(){
								System.out.print("\033[H\033[2J");
				}
				
				public void exit(){
								clearScr();
								System.out.println("Exiting...");
								delay(1000);
								clearScr();
								System.out.println("Exit Successfully");
								System.exit(0);
				}
				
				/////Nav options
				public void navOptions(){
								while(true){
								System.out.println("00) Go to dashboard");
								System.out.println("0) Exit");
								String navInput = userInput.nextLine();
								if(navInput.equals("00")){
												loadingDelay(800);
												dashboard();
												break;
								}else if(navInput.equals("0")){
								exit();
								}else{
												System.out.println("Invalid entry! \n Please try again");
												
								}
								}
				}
				
				public void withdraw(){
								System.out.println("Enter Amount:");
								double amount;
								while(true){
								String amtInput = userInput.nextLine();
								try{
												amount = Double.parseDouble(amtInput);
												break;
								}catch(NumberFormatException e){
												System.out.println("Invalid amount!\n Pleae Try again.");
								}
								}
								if(amount > balance){
												System.out.println("Sorry insufficient balance");
												withdraw();
								}
								balance -= amount;
								System.out.println("$"+amount+" Successfully withdrawn");
								navOptions();
				}
				
				public void bankList(){
								clearScr();
								System.out.println("Choose Bank!");
								System.out.println("1. HBL");
								System.out.println("2. UBL");
								System.out.println("3. Meezan Bank");
								System.out.println("4. MCB Bank");
								System.out.println("5. Bank Alfalah");
								System.out.println("6. Allied Bank");
								System.out.println("7. Search");

								navOptions();
				}
				
				public void checkBalance(){
								clearScr();
								System.out.println("Balance = $"+balance);
								navOptions();
				}
				
				
				public void deposit(){
								clearScr();
								System.out.println("Deposit!");
								System.out.println("Enter Amount:");
								double amount;
								while(true){
								String amtInput = userInput.nextLine();
								try{
												amount = Double.parseDouble(amtInput);
												break;
								}catch(NumberFormatException e){
												System.out.println("Invalid amount!\n Pleae Try again.");
								}
								}
								balance += amount;
								System.out.println("$"+amount+" Successfully added");
								navOptions();
				}
				
				
				
				
				///List ot Menu
				public void dashboard(){
								clearScr();
								System.out.println("Welcome To Dashboard\n");
								System.out.println("Dashboard:");
								System.out.println(" 1) Transfer");
								System.out.println(" 2) Check Balance");
								System.out.println(" 3) Withdraw");
								System.out.println(" 4) Deposit");
								System.out.println(" 0) Exit");
								System.out.println();
								int nav;
								while(true){
												
													String navInput = userInput.nextLine();
												try{
																nav = Integer.parseInt(navInput);
																break;
												}catch(NumberFormatException e){
																System.out.println("Invalid Entry!\n Only numbers are allowed.");  
												}
												
								}
								
								switch(nav){
												case 1:
												loadingDelay(1000);
												bankList();
												break;
												case 2:
												loadingDelay(1000);
												checkBalance();
												break;
												case 3:
												loadingDelay(1000);
												withdraw();
												break;
												case 4:
												loadingDelay(1000);
												deposit();
												break;
												case 0:
												System.out.println("Loading...");
												exit();
												break;
												default:
												System.out.println("Not in the list: \nTry again.");
												dashboard();
								}
												
								
				}
}

public class LLCFBanking {
				
				public static void main(String[] args) {
								System.out.println("--{ Digital Banking }--");
								LinkedList<BankCustomer> customers = new LinkedList<>();
								customers.add(new BankCustomer("Mehmood", 120000));
								customers.get(0).dashboard();
				}
				
}
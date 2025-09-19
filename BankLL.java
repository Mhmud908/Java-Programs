
class BankCustomer{
				String name;
				double balance;
				BankCustomer next;
				
				BankCustomer(String name, double balance){
								this.name = name;
								this.balance = balance;
								this.next = null;
				}
}

class BankSystem{
				BankCustomer head;
				
				public void addCustomer(String name, double balance){
								BankCustomer newCustomer = new BankCustomer(name, balance);
								if(head == null){
												head = newCustomer;
								}else{
												BankCustomer temp = head;
												while(temp.next != null){
																temp = temp.next;
												}
												temp.next = newCustomer;
								}
				}
public void viewCustomers(){
				if(head == null){
								System.out.println("No Customers in the Bank");
								return;
				}
				
				BankCustomer temp = head;
				 System.out.println("Bank Customers!");
				while(temp != null){
								System.out.println("Name: "+temp.name+", Balance: $"+temp.balance);
								temp = temp.next;
				}
}
}

public class BankLL{
				
				public static void main(String[] args) {
								System.out.println("Digital Banking");
								BankSystem bank = new BankSystem();
								
								bank.addCustomer("Mehmood", 9508075);
								bank.addCustomer("Asad" , 9508075);
								
								bank.viewCustomers();
				}
				
}
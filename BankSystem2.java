import java.util.Scanner;

//// Customer Details
class BankCustomer {
    String name;
    double balance;

    BankCustomer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false; // not enough money
        }
        balance -= amount;
        return true;
    }


    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}

//// Banking System logic and ui ux/interaction

class BankApp {
    private Scanner input = new Scanner(System.in);
    private BankCustomer customer;

    BankApp(BankCustomer customer) {
        this.customer = customer;
    }

    public void clearScr() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dashboard() {
        while (true) {
            clearScr();
            System.out.println("Welcome, " + customer.getName());
            System.out.println("1) Check Balance");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("0) Exit");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    clearScr();
                    System.out.println("Balance = $" + customer.getBalance());
                    pause();
                    break;
                case "2":
                    clearScr();
                    System.out.print("Enter deposit amount: ");
                    double dep = Double.parseDouble(input.nextLine());
                    customer.deposit(dep);
                    System.out.println("$" + dep + " deposited successfully.");
                    pause();
                    break;
                case "3":
                    clearScr();
                    System.out.print("Enter withdraw amount: ");
                    double wd = Double.parseDouble(input.nextLine());
                    if (customer.withdraw(wd)) {
                        System.out.println("$" + wd + " withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    pause();
                    break;
                case "0":
                    clearScr();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
                    pause();
            }
        }
    }

    private void pause() {
        System.out.println("\nPress Enter to continue...");
        input.nextLine();
    }
}



public class BankSystem2 {
				
				public static void main(String[] args) {
								System.out.println("Digital Banking!");
								
								BankCustomer mehmood = new BankCustomer("Mehmood", 120000);
								BankApp app = new BankApp(mehmood);
								app.dashboard();

                                
				}
				
}


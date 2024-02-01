import java.util.*;

class Account {
	int mn;

	Scanner sc = new Scanner(System.in);

	int accNo;
	String uName;
	float amount;

	Account(int accountNo, String name, float uAmount) {

		accNo = accountNo;
		uName = name;
		amount = uAmount;
	}

	void display() {

		System.out.print("\033[H\033[2J");
		System.out.println("Account No\t\tName\t\tBalance");
		System.out.println(accNo + "\t\t" + uName + "\t\t$" + amount);

		System.out.println("0) Menu");
		System.out.println("Enter any Number Exit");
		mn = sc.nextInt();

		if (mn == 0) {

			menu();
		} else {

			System. out. print("\033[H\033[2J");
			System.out.println("Thanks for using");

		}
	}

	void login() {

		String username = "mehmood321";
		String password = "Mehmood123";

		String usrName, usrPass;
		System.out.println("Username:\n\t\t");
		usrName = sc.next();
		System.out.println("Password:\n\t\t");
		usrPass = sc.next();

		if (usrName.compareTo(username) == 0 && usrPass.compareTo(password) == 0) {

			System.out.print("\033[H\033[2J");
			System.out.println("\n\n\t\t\t\t Login Successfull");

			menu();
		} else {

			System.out.print("\033[H\033[2J");
			System.out.println("Sorry! \n\t\t\t Invalid Credentials");

			login();
		}
	}

	void checkBalace() {

		System.out.print("\033[H\033[2J");
		System.out.println("Balance is $" + amount);

		System.out.println("0) Menu");
		System.out.println("Enter any Number Exit");
		mn = sc.nextInt();

		if (mn == 0) {

			System.out.print("\033[H\033[2J");
			menu();
		} else {

			System.out.print("\033[H\033[2J");
			System.out.println("Thanks for using");

		}
	}

	void deposit(float amt) {

		System.out.print("\033[H\033[2J");
		amount = amount + amt;

		System.out.println("0) Menu");
		System.out.println("Enter any Number Exit");
		mn = sc.nextInt();

		if (mn == 0) {

			System.out.print("\033[H\033[2J");
			menu();
		} else {

			System.out.print("\033[H\033[2J");
			System.out.println("Thanks for using");
		}
	}

	void withdraw(float amt) {

		System.out.print("\033[H\033[2J");
		if (amount < amt) {

			System.out.print("\033[H\033[2J");
			System.out.println("Insaficient funds");
		} else {

			System.out.print("\033[H\033[2J");
			amount = amount - amt;
			System.out.println("$" + amt + " Debited");
		}

		System.out.println("0) Menu");
		System.out.println("Enter any Number Exit");
		mn = sc.nextInt();

		if (mn == 0) {

			System.out.print("\033[H\033[2J");
			menu();
		} else {

			System.out.print("\033[H\033[2J");
			System.out.println("Thanks for using");

		}
	}

	public void menu() {

		System.out.print("\033[H\033[2J");
		int n;
		System.out.println("Menu\n");
		System.out.println("1) Check Balance");
		System.out.println("2) Account info");
		System.out.println("3) Withdraw");
		System.out.println("4) Deposit");

		n = sc.nextInt();
		float x;
		switch (n) {

			case 1:
				checkBalace();
				break;

			case 2:
				display();
				break;

			case 3:
				System.out.print("\033[H\033[2J");
				System.out.println("Withdraw\n");
				System.out.println("Enter Amount");
				x = sc.nextInt();
				withdraw(x);
				break;

			case 4:
				System.out.print("\033[H\033[2J");
				System.out.println("Deposit\n");
				System.out.println("Enter Amount");
				x = sc.nextInt();
				deposit(x);
				break;

			default:
				System.out.print("\033[H\033[2J");
				System.out.println("Sorry!\n\t\t Invalid Entry");
				menu();

		}

	}
}

class Banking {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//// Scanner sc= new Scanner(System.in);

		System. out. print("\033[H\033[2J");
		Account a = new Account(102328212, "Mehmood", 22400);
		System.out.println("\t\t----{ Degital Banking }----");
		a.login();

	}

}
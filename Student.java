
import java.util.Scanner;

class tStudent {

	int rollno;
	String name;

	tStudent(int r, String n) {

		rollno = r;
		name = n;
	}

	void disInfo() {

		System.out.println("Roll No " + rollno + "\nName " + name);

	}
}

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * tStudent s1= new tStudent(), s2= new tStudent();
		 * s1.insertRecord(628, "Mehmood");
		 * s2.insertRecord(23, "Aqil");
		 * 
		 * s1.disInfo();
		 * s2.disInfo();
		 * int rNo;
		 * String Nm;
		 */

		System.out.println("Please Enter total no of Students:");
		int sno = sc.nextInt();

		tStudent s[] = new tStudent[sno];
		for (int i = 0; i < s.length; i++) {
			System.out.println("Roll No");
			int rNo = sc.nextInt();
			System.out.println("Name");
			String Nm = sc.next();
			s[i] = new tStudent(rNo, Nm); // Use the constructor to initialize each tStudent object
		}
		// tStudent s[] = new tStudent[sno];

		// for(int i=1; i<=s.length; i++){

		// System.out.println("Roll No");
		// int rNo = sc.nextInt();
		// System.out.println("Name");
		// String Nm = sc.next();
		// s[i] = new tStudent(rNo,Nm);
		// }

		for (int i = 0; i < s.length; i++) {

			s[i].disInfo();
		}
	}
}
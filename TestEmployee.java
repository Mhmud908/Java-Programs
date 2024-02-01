
import java.util.Scanner;


class Employee{

	int id;
	String name;
	float salary;
	
	Employee(int i, String n, float s){
	
		id = i;
		name = n;
		salary = s;
	}
	
	void display(){
	
	System.out.println(id+"\t\t"+name+"\t\t$"+salary);
	}

}

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Total Number of Employees");
		int ne = sc.nextInt();
		int id;
		String name;
		float salary;
		Employee e[] = new Employee[ne];
		
		for(int i=0; i<e.length; i++){
		
			System.out.println("Enter your id");
			id = sc.nextInt();
			System.out.println(" Enter your Name");
			name = sc.next();
			System.out.println("Enter your Salary");
			salary = sc.nextFloat();
			e[i] = new Employee(id, name, salary);
		}
		
		
		System.out.println("\n\n\nid\t\t"+"Name\t\t"+"Salary");
		
		
		for (int i=0; i<e.length; i++){
		
			e[i].display();
		}

		System.out.println("\n\n");
	}
}
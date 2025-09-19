class Student{
				String name;
				int rollNo;
				Student next;
				Student(String name, int rollNo){
								this.name = name;
								this.rollNo = rollNo;
								this.next = null;
				}
}
class SchoolSystem{
				Student head;
				public void addStudent(String name, int rollNo){
								Student newStudent = new Student(name, rollNo);
								if(head == null){
												head = newStudent;
								}else{
												Student temp = head;
												while(temp.next != null){
																temp = temp.next;
												}
												temp.next = newStudent;
								}
				}
				public void viewStudent(){
								if(head == null){
												System.out.println("No Student in the School");
												return;
								}
								Student temp = head;
								System.out.println("School Students");
								while(temp != null){
												System.out.println("Name: "+head+" "+temp.name+", Roll No: "+temp.rollNo);
												temp = temp.next;
								}
				}
}

public class SchoolMS {
				
				public static void main(String[] args) {
								System.out.println("-{ Student Management Systen }-");
								SchoolSystem school = new SchoolSystem();
						//		school.addStudent("Ali", 35);
								//school.addStudent("Riya", 36);
								school.viewStudent();
				}
				
}
import java.util.LinkedList;
class Student{
				String name;
				double rollNo;
				Student(String name, double rollNo){
								this.name = name;
								this.rollNo = rollNo;
				}
				
				public String toString(){
								return "Name: "+name+", Roll No: "+rollNo;
				}
}
public class LLCollections {
				
				public static void main(String[] args) {
								System.out.println("-{ LinkedList Collections }-");
								
								LinkedList<Student> students = new LinkedList<>();
								
								students.add(new Student("Mehmood", 1705));
								students.add(new Student("Asad", 1706));
					//			System.out.println(list);
								int i=0;
								for(Student s : students){
												i++;
												System.out.println(i+" ) "+s);
												
								}
								
				}
				
}
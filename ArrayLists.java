import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
				public static void main(String args[]){
								
								ArrayList<Integer> list = new ArrayList<Integer>();
								System.out.println(list);
								list.add(3);
								list.add(0);
								list.add(4);
								System.out.println(list);
								list.add(1,9);
								System.out.println(list);
								list.set(0,4);
								System.out.println(list);
								list.set(3, 3);
								list.add(1);
								System.out.println(list);
								list.remove(4);
								System.out.println(list);
								int size =list.size();
								System.out.println("Size is "+size);
								Collections.sort(list);
								System.out.println(list);
								
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter size");
								int n = sc.nextInt();
								System.out.println("n = "+n);
								System.out.println("Now enter elements");
								
								for(int i =0; i<n; i++){
												int temp = sc.nextInt();
												list.add(temp);
												System.out.println("Successfully added "+temp);
								}
								System.out.println(list);
								Collections.sort(list);
								System.out.println(list);
								
								
				}
}
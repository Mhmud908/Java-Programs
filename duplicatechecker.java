import java.util.*;
class duplicatechecker {
	
	private static boolean dupchecker(int[] ar){
			
		for (int i =0; i< ar.length;i++){
		
			for(int j=0;j<ar.length;j++){
			
				
				if(ar[i]==ar[j]&& i!=j){
				
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5,1};
		boolean result = dupchecker(arr);
		
		
			System.out.println(result);
		
	}
}

public class proOfArray {
	
	public static void main(String[] args) {
		
		int arr[] = {-1,1,0,-3,3};
		int result[] = new int[arr.length];
		////result[0] =arr[0];
		////System.out.println(result[0]);
			
		for (int i=0; i<arr.length; i++){
		
			int temp = 1;
			for (int j=0;j<arr.length;j++){
			
				if (i!=j){
				
					
					temp *=arr[j];
				}
				
			}
			result[i] = temp;
		}
		
		for (int i= 0; i<result.length; i++){
		
			System.out.print(result[i]+",");
		}
		
	}
}
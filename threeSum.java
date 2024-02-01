
public class threeSum {
	
	public static void main(String[] args) {
		
		int arr[] = {-1,0,1,2,-1,-4};
		
		for (int i=0; i<arr.length; i++){
		
			for (int j=1; j<arr.length-1; j++){
			
				for (int k=2; k<arr.length-2; k++){
				
					if (arr[i]+arr[j]+arr[k]==0 && i!=j && j!=k && i!=k){
					System.out.println(arr[i]+","+arr[j]+","+arr[k]+"     ");
						}
				}
			}
		}
	}
}

public class mThreeSum {
	
	public static void main(String[] args) {
		
		int arr[] = {-1,0,1,2,-1,-4};
		
		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr.length; j++){
			
				if(arr[i]+arr[j]+arr[j+1]==0 && i!=j&& i!=j+1){
				
					
					System.out.println(arr[i]+","+arr[j]+","+arr[j+1]);
				}
			}
		}
		
	}
}
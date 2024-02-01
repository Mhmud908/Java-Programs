
public class maxSubArray {
	
	public static void main(String[] args) {
		
		
		//int arr[] = {-2,1,3,4,-1,2,1,-5,4};
		
		int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
		int temp = arr[0];
		
		for(int i = 1; i <arr.length; i++){
		
			if(temp+arr[i]+arr[i+1]<=temp && i+1+1<arr.length){
			
				temp=arr[i+1+1];
			}
			else{
			
				temp+=arr[i];
			}
		}
		
	}
}
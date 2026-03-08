public class MissingNumber {

    public static void main( String args[]){

        

        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;

        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum = sum+arr[i];
        }

    }

}

package Arrays;

public class RotateArrayByKPositions {
    
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        if(arr.length == 0) {
            System.out.println("Array is empty.");
        }else{
            k = k % arr.length;

            for(int i = 0; i < k; i++){
                int lastElement = arr[arr.length-1];

                for(int j = arr.length-1; j > 0; j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = lastElement;
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }


    }

        
}

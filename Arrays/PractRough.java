package Arrays;

import java.util.Arrays;

public class PractRough {
    public static void main(String[] args) {

        int[] arr = {9, 1, 0, 3, 4, 5};

        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

         System.out.println("The array after reversing is: ");

         System.out.println("Reversed: " + Arrays.toString(arr));
    }
    
}

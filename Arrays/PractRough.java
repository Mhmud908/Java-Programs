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

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}

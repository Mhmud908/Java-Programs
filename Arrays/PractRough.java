package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PractRough {
    public static void main(String[] args) {


        // Example Input
        int[] arr = {1, 0, 1, 2, 0, 5, 0, 9}; 


        int insertPos = 0;
        ///// for non zeros
         for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[insertPos++] = arr[i];
            }
         }
        
         ///// for zeros
         for(int i = insertPos; i < arr.length; i++){
                arr[i] = 0;
         }

         System.out.println(Arrays.toString(arr));

        
        



    }

}

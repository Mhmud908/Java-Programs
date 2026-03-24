package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PractRough {
    public static void main(String[] args) {


        // Example Input
        int[] nums = {1, 0, 1, 2, 0, 5, 0, 9}; 

        int insertPos = 0;
        System.out.println(nums[0]);

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 || nums[i] < 0 || nums[i] > 0) {
                // System.out.println(nums[i]);
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        for(int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        }

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        

        
        



    }

}

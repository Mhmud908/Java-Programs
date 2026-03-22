package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PractRough {
    public static void main(String[] args) {




        // Example Input
        int[] nums = {-1, 0, 1, 2, -1, -4};
        
        // 1. Sort the array - Crucial for the two-pointer approach
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Optimization: If the smallest number is > 0, no triplet can sum to 0
            if (nums[i] > 0) break;

            // Skip duplicate values for the first element to ensure unique triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Sum too small, move rightward
                } else {
                    right--; // Sum too large, move leftward
                }
            }
        }

        // Print the results
        System.out.println("Unique Triplets: " + result);

        
        



    }

}

import java.util.Map;
import java.util.HashMap;

public class TwoSum2 {

    public static int[] twoSum(int [] nums, int target){

        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

                public static void main(String args[]){
                                int[] arr = {2, 7, 11, 15};
                                int target = 9;
                                int[] result = twoSum(arr, target);
                                System.out.println("Indices: " + result[0] + ", " + result[1]);
                               
                        
                }

    
}

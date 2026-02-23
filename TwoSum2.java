import java.util.Map;
import java.util.HashMap;

public class TwoSum2 {

    public static int[] twoSum(int [] nums, int target){

         Map<Integer, Integer> indices = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(indices.containsKey(temp)){
                return new int[]{indices.get(temp), i};
            }
            indices.put(nums[i], i);
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

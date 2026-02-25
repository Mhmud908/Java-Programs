

public class TwoSum3{

    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> bothNums = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int secondNum = target - nums[i];
            if(bothNums.containsKey(secondNum)){
                return bothnums[0]+" "+bothNums[1];
            }

        }
    }

    
    public static void main(String[] args) {
        
    }
}
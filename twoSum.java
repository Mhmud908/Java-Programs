public class twoSum {

    public static void main(String[] args){
        
        int nums[] = {3,2,4};
        int tg = 6;

        for(int i=0; i<nums.length; i++){

            for(int j=1; j<nums.length; j++){
                if(nums[i]+nums[j]==tg){
                    System.out.println("The indices are ["+i+","+j+"]");
                    System.exit(0);
                }
            }
        }
    }
    
}

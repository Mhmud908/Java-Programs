package Arrays;

public class HareTortoiseFindDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};

        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entrance to cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        System.out.println("Duplicate: " + slow);
    }
}

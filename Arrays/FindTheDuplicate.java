package Arrays;

import java.util.HashSet;

public class FindTheDuplicate {

    public static void main(String args[]) {

        int arr[] = { 1, 3, 4, 2, 2 };

        HashSet<Integer> set2 = new HashSet<>();
      
        for (int i = 0; i < arr.length; i++) {
            if (!set2.add(arr[i])) {
                System.out.println("Duplicate: " + arr[i]);
                break;
            }
        }

    }

}

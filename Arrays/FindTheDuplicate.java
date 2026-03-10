package Arrays;

import java.util.Set;
import java.util.HashSet;


public class FindTheDuplicate {

    public static void main(String args[]){

        Set<Integer> set = new HashSet<>();

        int arr[] = {1,3,4,2,2};

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        System.out.println(set);

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i]) == false){
                System.out.println(arr[i]);
            }
        }
    }
    
}

package Arrays;

public class RotateArraysOnePosRight {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        if (arr.length == 0) {
            System.out.println("Array is empty.");
        }else {
            int lastElement = arr[arr.length-1];

            for(int i = arr.length-1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = lastElement;
        
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    
}
}
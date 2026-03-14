package Arrays;

public class PractRough {
    public static void main(String[] args) {

        int[] arr = {9, 1, 0, 3, 4, 5};

        int largest = Integer.MIN_VALUE ;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }

        }
        System.out.println("The largest number in the array is: " + largest);
        System.out.println("The second largest number in the array is: " + secondLargest);


    }
    
}

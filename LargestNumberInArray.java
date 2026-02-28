public class LargestNumberInArray {

    public static void main(String[] args) {
        int[] numbers = {-10, -5, -2, -30};

         int largest = numbers[0];
        for(int i=1; i<numbers.length; i++){
                if(numbers[i] > largest){
                    largest = numbers[i];
                }
            }

        System.out.println("The largest number in the array is: " + largest);
        
    }
}

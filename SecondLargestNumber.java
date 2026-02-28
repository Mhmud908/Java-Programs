public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 2, 30};


            int largest = numbers[0];
        int secondLargest = numbers[1];

        for(int i=1; i<numbers.length; i++){

                if(numbers[i] > largest){
                    if(largest > secondLargest){
                    largest = numbers[i];
                    }else{
                        largest = secondLargest;
                    }
                }
            }

        }
}

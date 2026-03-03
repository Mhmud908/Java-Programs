public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] numbers = {9, 9, 9};

        if(numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] > largest) {

                secondLargest = largest;
                largest = numbers[i];

            }
            else if(numbers[i] > secondLargest && numbers[i] != largest) {

                secondLargest = numbers[i];

            }
        }

        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists.");
        }
        else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}
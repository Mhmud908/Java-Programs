package Arrays;
public class MissingNumber {

    public static void main(String args[]) {

        int[] arr = { 1, 2, 4, 5 };
        int n = 5;
        int sum = n * (n + 1) / 2;
        int newSum = 0;
        for (int i = 0; i < arr.length; i++) {
            newSum = newSum + arr[i];
        }
        int missingNumber = sum - newSum;
        System.out.println("Missing Number is " + missingNumber);
    }

}

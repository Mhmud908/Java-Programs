public class NumberCheck {

    public static void main(String[] args) {
        
        int num = 12345;
        int sum = 0;
        
        while(num > 0) {
            int digit = num % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            num /= 10; // Remove the last digit
        }
        

        System.out.println("The sum of the digits is: " + sum);
        
    }
    
}

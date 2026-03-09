package strings;

public class PalindromeStrings {

    public static boolean IsPalindrome(String str){

        int end = str.length()-1;
        System.out.println(str.length());

        for(int i = 0; i < end/2+1; i++){

            if(str.charAt(i) != str.charAt(end-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){

        String str = "abcdedcba";

        if(IsPalindrome(str))
            System.out.println("The string is Palindrome");
        else
            System.out.println("The string is Not Palindrome");

    }
    
}

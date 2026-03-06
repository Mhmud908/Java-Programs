/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package javaapplication3;

public class charPalindromeChecker {

    public static void main(String[] args) {

        String word = "Aallaallaallaa";
        StringBuilder words = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            char currChar = word.charAt(i);

            if (currChar >= 'A' && currChar <= 'Z') {
                words.append((char) (currChar + ('a' - 'A')));
            }
            else {

                words.append(currChar);
            }
        }

        if (checkPalindrome(words.toString()) == true) {
            System.out.println("\" " + words.toString() + " \" is a Palindrome");

        }
        else {

            System.out.println("\" " + words.toString() + " \" is Not a Palindrome");
        }
    }

    public static boolean checkPalindrome(String str) {

        int end = str.length() - 1;
        for (int i = 0; i < end / 2; i++) {

            if (str.charAt(i) != str.charAt(end - i)) {
                return false;
            }

        }
        return true;
    }

}

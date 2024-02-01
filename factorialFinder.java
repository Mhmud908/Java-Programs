/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

public class factorialFinder {

    public static int factorials(int n) {

        int fact = n;
        if (n > 1) {

            for (int i = n - 1; i >= 1; i--) {
                fact *= i;
            }

        }
        else {
            System.out.println("Sorry! Invalid Number");
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Factorial");

        int m = sc.nextInt();
        System.out.println("Factorial of " + m + " is " + factorials(m));
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.ArrayList;

public class reverseInteger {

    public static void main(String[] args) {
//        int number = 123456789;
//        int digit, reversed = 0;
//        while (number > 0) {
//
//            digit = number % 10;
//            reversed = reversed * 10 + digit;
//
//            number /= 10;
//        }
//
//        System.out.println("Reversed Integer is " + reversed);
        int number = 123456789;
        ArrayList<Integer> digit = new ArrayList<>();

        while (number > 0) {
            digit.add(number % 10);
            number /= 10;
        }
        System.out.println("Reversed Integer");
        for (int i = 0; i < digit.size(); i++) {
            System.out.print(digit.get(i));
        }

    }
}

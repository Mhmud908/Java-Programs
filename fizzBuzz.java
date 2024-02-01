/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author kjhkh
 */
public class fizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(", FizzBuzz");

            }

            else if (i % 5 == 0) {
                System.out.print(", Buzz");

            }
            else if (i % 3 == 0) {
                System.out.print(", Fizz");

            }
            else {
                System.out.print(", " + i);
            }
        }
    }

}

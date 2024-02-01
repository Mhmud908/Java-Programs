/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.*;

/**
 *
 * @author kjhkh
 */
public class quadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, x2;
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();

        double disc = (b * b) - (4 * (a * c));
        if (disc > 0) {
            x1 = (-b + Math.sqrt(disc)) / (2 * a);
            x2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Roots are Real and diferrent");
            System.out.println("Root1 = " + x1 + "\n Root2 = " + x2);
        } else if (disc == 0) {
            x1 = -b / (2 * a);
            System.out.println("Roots are Real and Same Root = " + x1);
        } else {

            x1 = -b / (2 * a);
            x2 = Math.sqrt(Math.abs(disc)) / (2 * a);
            System.out.println("Roots are Complex. Root1 = " + x1 + " + " + x2 + "i, Root2 = " + x1 + " - " + x2 + "i");
        }

    }

}

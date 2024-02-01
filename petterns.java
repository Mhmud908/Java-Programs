/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author kjhkh
 */
public class petterns {

    public static void main(String[] args) {
        //            Square pettern
        /*for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }*/
        //        Triangular pettern

        //        for (int i = 0; i < 10; i++) {
        //
        //            for (int j = 0; j < i; j++) {
        //                System.out.print("* ");
        //            }
        //            System.out.println();
        //        }
//        Equal Triangle
        int m = 10;
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}

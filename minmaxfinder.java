/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author kjhkh
 */
public class minmaxfinder {

    public static void main(String[] args) {

//        int arr[] = {2, 4, 6, 0, -2, 3, 7, 8};
//        int min = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//
//        }
//        System.out.println("Min is " + min);
        int arr[] = {2, 4, 6, 0, -2, 3, 7, 8};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Max is " + max);
    }
}

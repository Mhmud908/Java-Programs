/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.*;

public class crammersRule {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col, row;
        System.out.println("Enter Order of the Matrix");
        System.out.println("Enter Number of Columns of the Matrix");
        col = sc.nextInt();
        System.out.println("Enter Number of Rows of the Matrix");
        row = sc.nextInt();
        int matrixA[][] = new int[row][col];

        System.out.println("Please Enter The Coefficients of Matrix A");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int temp = sc.nextInt();
                matrixA[i][j] = temp;
            }
        }
        System.out.println("Enter values in LHS");
        int matrixB[][] = new int[row][1];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < 1; j++) {
                int temp = sc.nextInt();
                matrixB[i][j] = temp;
            }
        }
        int D;
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < 1; j++) {
                int temp;
                if (j != col - 1 && i != row - 1) {
                    temp = matrixA[i][j] * ((matrixA[i + 1][j + 1] * matrixA[i + 2][j + 2]) - (matrixA[i + 1][j + 2] * matrixA[i + 2][j + 1]));
                }
            }
        }

    }
}

package com.tnsif.Array;

public class ArrDemo2D {
    public static void main(String[] args) {
        int[][] num = new int[3][4];

        // Filling the array with random numbers
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int)(Math.random() * 100);
            }
        }

        // Printing the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
    }
}



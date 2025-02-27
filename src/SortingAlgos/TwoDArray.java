package SortingAlgos;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {


        int[][] arr = {
                {7, 13,2,3,4,3,2},
                {2, 8},
                {5, 14},
                {3, 9},
                {1, 10},
                {6, 11},
                {4, 12},
                {9, 7},
                {8, 15},
                {10, 5}
        };
        sort(arr);
    }


    public static void sort(int[][] arr) {
        int n = arr.length;


        for (int i = 0; i < arr.length; i++) { // Loop through rows
            for (int j = 0; j < arr[i].length; j++) { // Loop through columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];


        Scanner s = new Scanner(System.in);

        for( int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = s.nextInt();
            }
        }

        for( int i =0; i<arr.length; i++){
            for( int j=i+1; j<arr[i].length; j++){
                 int temp = arr[i][j];
                 arr[i][j] = arr[j][i];
                 arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;

            while (start < end) {
                // For odd-length rows, skip the middle element
                if (start == arr[i].length / 2) break;

                // Swap elements
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                // Move pointers
                start++;
                end--;
            }
        }
        for(int i =0 ;i <arr.length; i++){
            for( int j =0; j <arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

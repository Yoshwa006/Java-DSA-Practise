package Matrix;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
       System.out.println(run(new int[][]{{1,2,3}, {4,5,6}, {7,8,9,}, {10,11,12},{13,14,15}, {16,17,18}}));
    }
        public static int run(int[][] arr){
            int n = arr.length;
            int sum =0;
            

            for(int i =0; i<n; i++){
                if(i%2 !=0 ){
                    for(int j = arr[i].length-1; j>=0 ; j--){
                        System.out.print(arr[i][j] + " ");
                        sum += arr[i][j];
                    }
               }
               else{
                for(int j =0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                    sum += arr[i][j];
                }
               }
               System.out.println();
            }
            System.out.println(
                "   "
            );
            return sum;
        }
    }

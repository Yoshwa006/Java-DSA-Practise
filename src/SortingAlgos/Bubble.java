package SortingAlgos;

import java.util.Arrays;

public class Bubble {


    public static void main(String[] args) {
        int[] arr = {1,35,3,12,14,5,2,3,12,4,321,412};
        Bubble(arr);
    }

    public static void Bubble(int[] arr){

        int n =arr.length;

        for(int i=0; i< n-1; i++){
            for(int j=0; j< n-1-i; j++){


                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

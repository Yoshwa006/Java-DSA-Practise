package LeetCode;
import LinkedList.single.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class two_numbers {
    public static void main(String[] args) {
        Remove(new int[]{0,1,2,2,3,0,4,2}, 2);
    }


    public static int PileOfGifts(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            heap.add(num);
        }

        for (int j = 0; j < k ; j++) {
            int pol = heap.poll();

            int ans = (int) Math.floor(Math.sqrt(pol));

            heap.add(ans);
        }
        int index = 0;
        long sum = 0;
        while (!heap.isEmpty()) {
            arr[index++] = heap.poll();
        }

        for( int i : arr){
            sum = sum + i;
        }
        return (int) sum;
    }

    public static void Remove(int[] arr, int val){
        int l =0;
        int r = arr.length- 1;
        int count =0;
        while(l<r){
            if(arr[l] == val){
                count++;
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
            }
            else{
                l++;
            }
        }
        System.out.println(Arrays.toString((arr)));
        System.out.println(arr.length - count);
    }
}

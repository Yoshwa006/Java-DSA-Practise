package Dynamic_Programing;

import java.util.Arrays;
import java.util.HashSet;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arr ={2,3,5,7,9};
//        System.out.println(two_sum(arr,13));

//        System.out.println(checksortedusingrec(new int[]{1,2,3,4,5}, 0));

//        System.out.println(search(new int[] {1,2,3,4,5}, 0,4));

//        System.out.println(sum(new int[]{1,2,3,4,8},0,0));

//        System.out.println(power(2,3,1));
//        print(12,1);

//        System.out.println(max_in_array(new int[]{1,2,4,6,9,5,3,5},0,0));
        System.out.println(sum_of_digits(12661,0));
    }




    public static int fibo(int n, int[] dp){
            if (n <= 1) {
                return n;
            }
            if (dp[n] != -1) {
                return dp[n]; // Return cached result
            }
            dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp); // Store result
            return dp[n];
    }

    public static boolean two_sum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();


        for( int i :arr){
            int c = target-i;
            if(set.contains(c)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static boolean checksortedusingrec(int[] arr,int index){

        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return checksortedusingrec(arr,index+1);
    }

    public static int search(int[] arr, int index, int target){

        if(index == arr.length-1){
            return -1;
        }


        if(arr[index] == target){
            return index;
        }


        return search(arr,index+1,target);
    }

    public static int sum(int[] arr, int index, int sum){
        sum += arr[index];
        if(index == arr.length-1){
            return sum;
        }

        return sum(arr,index+1,sum);
    }

    public static int power(int x, int n, int p){
        if(n==0){
            return p;
        }

        return power(x,n-1,p*x);

    }

    public static void print(int n, int index){
        if(index == n){
            System.out.println(index);
            return;
        }
        System.out.println(index);
        print(n,index+1);
    }

    public static int max_in_array(int[] arr,int max, int index){
        if(index == arr.length-1){
            return max;
        }
        if(arr[index] > max){
            max = arr[index];
        }
        return max_in_array(arr,max,index+1);
    }

    public static int sum_of_digits(int n, int sum){
        if(n==0){
            return sum;
        }int rem = n%10;
//        sum += rem;
        return sum_of_digits(n/10,sum+rem);
    }


}

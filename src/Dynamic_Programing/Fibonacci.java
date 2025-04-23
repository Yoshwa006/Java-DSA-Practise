package Dynamic_Programing;

import java.util.Arrays;
import java.util.HashSet;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(mainRec(8));
    }



public static int mainRec(int n){
    int[] dp = new int[n+1];
    Arrays.fill(dp,-1);
    return fibo(n, dp);
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

    private  static long rec(int i,int[][] questions,long[] dp,int n)
    {
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];

        long take = questions[i][0] + rec(i+questions[i][1]+1,questions,dp,n);
        long dont = rec(i+1,questions,dp,n);

        return dp[i] = Math.max(take,dont);

    }
    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        Arrays.fill(dp,-1);
        return rec(0,questions,dp,n);
    }

}

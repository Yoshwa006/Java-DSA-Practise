package Arrays.Practice;

import java.util.Arrays;

public class run {
    public static void main(String[] args) {
        print(1);
        System.out.println(Arrays.toString(fibo(8)));
    }

    public static void print(int n){
        if(n > 10){
            return;
        }
        print(n+1);
        System.out.println(n);
    }
    public static int[] fibo(int n){
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
    }
}

package Dynamic_Programing;

public class frog {
    public static void main(String[] args) {
        System.out.println(minCost(new int[]{40,10,20,70}));
    }

    static int minCost(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 0;

        if (n >= 2)
            dp[1] = Math.abs(arr[1] - arr[0]);

        for (int i = 2; i < n; i++) {
            int oneStep = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int twoStep = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            dp[i] = Math.min(oneStep, twoStep);
        }

        return dp[n-1];
    }

}

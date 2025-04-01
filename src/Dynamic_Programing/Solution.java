package Dynamic_Programing;
import java.util.*;
class Solution {

        public static long mostPoints(int[][] questions) {
            long[] dp = new long[questions.length];
            int len = questions.length;
            dp[questions.length-1]=questions[questions.length-1][0];
            for(int i=questions.length-2;i>=0;i--){
                int nextQuestion = i + questions[i][1] + 1;
                long includePoints = questions[i][0] + (nextQuestion < len ? dp[nextQuestion] : 0);
                dp[i] = Math.max(dp[i+1], includePoints);
            }
            return dp[0];
        }

    public static void main(String[] args) {
        System.out.println(Solution.mostPoints(new int[][]{{3,2},{4,3},{4,4},{2,5}}));
    }
}
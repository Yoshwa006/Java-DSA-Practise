package CodeForces;

public class TungTungSahur {
    public static void main(String[] args) {
//        System.out.println(run("LLRLRLRRL" , "LLLRLRRLLRRRL"));4
        System.out.println(climbingStairs(3));
    }

    static boolean run(String p, String s) {
        int i = 0, j = 0;

        while (i < p.length() && j < s.length()) {
            if (p.charAt(i) != s.charAt(j)) return false;

            // Count how many times the current char repeats in p
            int pCount = 1;
            while (i + 1 < p.length() && p.charAt(i) == p.charAt(i + 1)) {
                i++;
                pCount++;
            }

            // Count how many times the current char repeats in s
            int sCount = 1;
            while (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                j++;
                sCount++;
            }

            // If s has fewer repeats than p for any char, invalid
            if (sCount < pCount) return false;

            i++;
            j++;
        }

        // Both strings should be fully matched
        return i == p.length() && j == s.length();
    }
public static int climbingStairs(int n){
            int[] dp = new int[n+1];


            dp[0] = 0;
            dp[1] = 1;

            for(int i =2; i<=n; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }

            return dp[n];
        }
    }

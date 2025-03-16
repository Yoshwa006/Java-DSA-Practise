package Arrays.Practice;

public class sampleclass {
    int count = 0;

    public static void main(String[] args) {
        sampleclass s = new sampleclass();
        int result = s.ReversePalindrome(195);
        if (result == -1) {
            System.out.println("No palindrome exists");
        } else {
            System.out.println(result);
        }
    }

    public int ReversePalindrome(int n) {
        while (count < 1000) {  // Limit to 1000 iterations
            count++;

            int rev = reverse(n);
            n = n + rev;

            if (isPalindrome(n)) {
                return n; // Return palindrome number
            }

            if (n > 4294967295L) {  // If it exceeds the limit
                return -1;
            }
        }
        return -1;  // No palindrome found
    }

    public boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}

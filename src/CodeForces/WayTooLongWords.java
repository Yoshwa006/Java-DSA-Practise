package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for (int i = 0; i <= z; i++) {
            String s = sc.nextLine();
            int n = s.length();
            if (n < 11) {
                System.out.println(s);
            } else {
                char ch = s.charAt(0);
                char ch1 = s.charAt(n - 1);
                System.out.print(ch);
                System.out.print(n - 2);
                System.out.println(ch1);
            }
        }

    }
}
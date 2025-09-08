package Arrays.Practice;

import javax.crypto.spec.PSource;
import java.util.*;

public class SumOfOddEven {
    public static void main(String[] args) {
        // LongestNiceSubArray(new int[]{1,2,3});
//        System.out.println(subarraySum(new int[]{1, 2, 3, 7, 5}, 12));
//        System.out.println(digitFive(612575551));
//        System.out.println(skipA("avyuauyavyusav"));
//        System.out.println(Dominos(new int[]{4,2,2,4}, new int[]{2,4,4,2}));
//        System.out.println(countSubarrWithEqualZeroAndOne(new int[]{0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1,
//                0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
//                0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0,
//                0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0,
//                0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0
//} , 7));
//        System.out.println(Arrays.deepToString(makezero(new int[][]{{2, 0, 3}, {1, 2, 4}, {3, 1, 0}})));
//        System.out.println(nCr(4,1));
//        System.out.println(getLongestSubsequence(new String[]{"e","a","b"}, new int[]{0,0,1}));
//        moveZeroes(new int[]{4, 0, 5, 0, 6, 7, 0, 8, 4, 5, 4, 22, 0, 9, 0, 8, 90, 7, 90, 0, 7, 0, 7, 0, 0, 7, 7, 0, 8, 7, 8, 0, 8, 7, 6, 0});
//        pyramid();
//        star();
//        invvpyramid();
//        ppyramid();
//        inversePyramid();
//        box();
//        System.out.println(findMaxAverage(new int[]{3,3,4,3,0} , 3));
//        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
//        System.out.println(longestPalindrome(new String[]{"lc","cl","gg"}));
//        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));1
//        System.out.println(numRescueBoats(new int[]{3,2,2,1} , 3));
//        System.out.println(adjacent(new int[]{1, 2, 4}));
        System.out.println(Arrays.toString(gen(4)));
        }


    static void sumofevenodd(int[] arr) {
        int n = arr.length;
        int pos = 1;
        int even = 0;
        int odd = 0;
        for (int j : arr) {
            if (pos % 2 == 0) {
                even += j;
            } else {
                odd += j;
            }
            pos++;
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
        int[] ar = {1, 2, 3, 4, 5, 2, 4, 2, 45, 2, 1, 56, 3, 2};
    }

    public static int reverse(int n) {
        String str = String.valueOf(n);
        StringBuilder st = new StringBuilder(str);
        st.reverse();

        return Integer.parseInt(String.valueOf(st));
    }

    public static int[] reverseUsingHash(int[] arr) {
        HashSet<Integer> list = new HashSet<>();

        for (int i : arr) {
            list.add(i);
        }

        int[] intArray = list.stream().mapToInt(Integer::intValue).toArray();

        return intArray;
    }

    public static String reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }

        String fin = new String(s);

        return fin;
    }


    public static String reverse(String s, int k) {
        int l = 0, r = s.length() - 1;
        char[] ch = s.toCharArray();
        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;

            r -= k;
            l += k;
        }

        return new String(ch);
    }

    public static void RemoveDuplicates(int[] arr) {
        int n = arr.length - 1;
        int l = 1;
        int r = 2;

        while (r < n) {
            if (arr[l] == arr[r]) {
                r++;
            } else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
        }
        int[] res = new int[r];
        for (int m : arr) {
            res[m] = arr[m];
        }
        for (int j : res) {
            System.out.print(res[j] + " ");
        }
    }

    public static int[] removeusinghash(int[] arr) {
        int n = arr.length;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int[] array = set.stream().mapToInt(Integer::intValue).toArray();

        return array;

    }

    public static boolean isSameAfterReversals(int num) {
        int res = 0;
        int res2 = 0;
        while (num != 0) {
            int rem = num % 10;
            res = (res * 10) + rem;
            num /= 10;
        }

        int g = res;
        while (g != 0) {
            int rem2 = g % 10;
            res2 = (res2 * 10) + rem2;
            g /= 10;
        }
        return res2 == res;
    }

    public static int[] Two_Sum(int[] arr, int target) {
        Arrays.sort(arr);

        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == target) {
                return new int[]{l, r};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{};
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

    }

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);

        int l = 0, r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{l, r};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return new int[]{};
    }

    public static int[] Two_Sum_usingHash(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int k = target - arr[i];

            if (map.containsKey(k)) {
                return new int[]{map.get(k), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] ch = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            sum += map.get(ch[i]);
        }

        return sum;
    }

    public static boolean isBoomerang(int[][] arr) {
        try {
            if ((arr[1][1] - arr[0][1]) / (arr[1][0] - arr[0][0]) ==
                    (arr[2][1] - arr[1][1]) / (arr[2][0] - arr[1][0])) {
                return false;
            }
        } catch (ArithmeticException e) {
            return false;
        }
        return true;
    }

    public static int minStoneSum(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            int h = (int) (double) (arr[max] / 2);
            arr[max] = h;
        }
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }

        return sum;
    }

    public static int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        return 0;
    }

    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];


        int i = 0;
        int j = nums1.length;
        for (int num : nums1) {
            arr[i] = num;
            i++;
        }

        for (int num : nums2) {
            arr[j] = num;
            j++;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int k = 1;
        while (k <= n) {
            if (k % 3 == 0 && k % 5 == 0) {
                list.add("FizzBuzz");
            } else if (k % 3 == 0) {
                list.add("Fizz");
            } else if (k % 5 == 0) {
                list.add("Buzz");
            } else {
                String s = String.valueOf(k);
                list.add(s);
            }
            k++;
        }

        return list;
    }


    public static int[] storing_max_subarray(int[] arr, int k) {
        int curr = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            curr = arr[i];
            list.add(curr);
            for (int j = i + 1; j < arr.length; j++) {
                curr += arr[j];
                list.add(curr);
            }
        }
        Collections.sort(list, Collections.reverseOrder());

        int[] f = new int[k];
        for (int i = 0; i < k; i++) {
            f[i] = list.get(i);
        }

        return f;
    }

    public static int sumOfDig(int[][] arr) {
        int k = 0;
        int sum = 0;


        while (k < arr.length) {
            sum += arr[k][k];
            k++;
        }

        return sum;
    }

    public static int findKthPositive(int[] arr, int k) {


        HashSet<Integer> set = new HashSet<>();
        List<Integer> missingNumbers = new ArrayList<>();

        // Add all array elements to the set
        for (int num : arr) {
            set.add(num);
        }

        // Check for missing numbers from 1 to n
        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            if (!set.contains(i)) {
                missingNumbers.add(i);
            }
        }
        if (missingNumbers.isEmpty()) {
            return arr[arr.length - 1] + k;
        }

        return missingNumbers.get(k - 1);
    }

    public static int[] plusOne(int[] arr) {
        int n = arr.length;

        // Start from the last digit and add 1
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;  // No carry, just return the array
                return arr;
            }
            arr[i] = 0;  // If the digit is 9, set it to 0 and continue to the next digit
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static boolean hehehe(int[] arr, int k) {
        if (k == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && i == 0) {
                continue;
            }
            if (arr[i] == 0) {
                count++;
            } else if (arr[i] == 1) {
                if (count >= k) {
                    count = 0;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        if (list.size() <= k) {
            return list.get(k - 1);
        }
        return list.get(k);
    }


    public static int SumOfConsectiveDigits(int n) {
        String s = String.valueOf(n);

        int len = s.length();
        int sum = 0;

        while (n != 0) {
            if (len % 2 == 0) {
                sum -= n % 10;
            } else {
                sum += n % 10;
            }
            len--;
            n /= 10;
        }

        return sum;
    }

    public static int SumOfConsectiveDigitsUsingRec(int n, boolean cas) {
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;

        if (cas) {
            return -digit + SumOfConsectiveDigitsUsingRec(n / 10, false);
        } else {
            return digit - SumOfConsectiveDigitsUsingRec(n / 10, true);
        }
    }

    public static int[] two553(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();


        for (int num : arr) {
            ArrayList<Integer> temp = new ArrayList<>(); // Store digits in correct order
            while (num != 0) {
                temp.add(num % 10);
                num /= 10;
            }
            Collections.reverse(temp);
            list.addAll(temp);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static int rangeSum(int[] arr, int n, int left, int right) {

        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                list.add(sum);
                sum = 0;
            }
        }

        Collections.sort(list);

        int ans = 0;
        for (int i = left; i <= right; i++) {
            ans += list.get(i - 1);
        }

        return ans;
    }

    public static void rotateImage(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int m = n - 1;


        for (int i = 0; i < n / 2; i++) {

            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][m];
                arr[i][m] = temp;
                m -= 1;
            }
            m = n - 1;
        }
    }

    public static boolean isPalindrome(int n) {
        int res = n;
        int res2 = 0;
        while (n != 0) {
            int rem = n % 10;
            res2 = (res2 * 10) + rem;
            n /= 10;
        }
        return res == res2;
    }

    // public static void LongestNiceSubArray(int[] arr){
    //    int l = 0;
    //    int max =0;

    //    for(int r = l+1; r<arr.length; r++ ){

    //    }

    // }

    public static int Stock(int[] arr) {
        int l = 0, r = 1;
        int ans = Integer.MIN_VALUE;
        while (l < r) {
            if (arr[l] < arr[r]) {
                l++;
                r++;
            } else if (arr[r] >= arr[l]) {
                ans = Math.max(ans, arr[r] - arr[l]);
            }
        }
        return ans;
    }

    public static int minimumOperations(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.isEmpty() && set.contains(arr[i])) {
                set.remove(arr[i]);
                count++;
            }
            set.add(arr[i]);
        }

        return count;
    }

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    if (sum == target) {
                        list.add(k);
                        list.add(j);
                        return list;
                    }
                }
            }
        }
        return null;
    }

    public static int slidingWindow(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return Integer.MIN_VALUE; // or handle error
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            max = Math.max(max, sum);
        }
        return max;
    }

//    public static int bomber(char[][] arr){
//        int n = arr.length;
//
//
//        for(int i =0; i<n; i++){
//            for(int j = i; )
//        }
//    }

    public static int digitFive(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 10 == 5) {
            return 1 + digitFive(n / 10);
        } else {
            return digitFive(n / 10);
        }
    }

    public static String skipA(String s) {
        StringBuilder ans = new StringBuilder();
        return helper(s, ans);
    }

    public static String helper(String s, StringBuilder ans) {
        if (s.isEmpty()) {
            return "";
        }
        if (s.charAt(0) != 'a') {
            ans.append(s.charAt(0));
        }
        helper(s.substring(1), ans);
        return new String(ans);
    }


    public static String testingMethods(String s) {
        return s.substring(1);
    }

    public static int Dominos(int[] t, int[] b) {
        int n = t.length;
        int cnt = 0;
        int in = 1;
        for (int i = 0; i < n; i++) {
            if (in == 7) {
                return -1;
            }
            if (t[i] == in || b[i] == in) {
                if (t[i] != in) {
                    cnt++;
                }
            } else {
                cnt = 0;
                i = 0;
                in++;
            }
        }
        in = 1;
        int bcnt = 0;
        for (int i = 0; i < n; i++) {
            if (in == 7) {
                return -1;
            }
            if (t[i] == in || b[i] == in) {
                if (b[i] != in) {
                    bcnt++;
                }
            } else {
                bcnt = 0;
                i = 0;
                in++;
            }
        }
        return Math.min(bcnt, cnt);
    }

    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int zero = 0;
            int one = 0;
            if (arr[i] == 0) zero++;
            if (arr[i] == 1) one++;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == 0) {
                    zero++;
                } else {
                    one++;
                }
                if (one == zero) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    static ArrayList<Integer> leftView(Node root) {
        if (root == null) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.add(root.data);

        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node curr = st.pop();
            if (curr.left != null) st.push(curr.left);
            if (curr.right != null) st.push(curr.right);


        }

        return list;

    }

    static int[][] makezero(int[][] arr) {
        int n = arr.length;

        boolean[] rows = new boolean[n];
        boolean[] col = new boolean[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || col[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }

    public static int nCr(int n, int r) {


        //base cases
        if (r == n) {
            return 1;
        }
        if (r == 0) {
            return 1;
        }
        if (r > n) {
            return 0;
        }


        int upper = 1;
        int t1 = n;

        while (t1 > 0) {
            upper *= t1;
            t1--;
        }

        int t2 = n - r;
        int l = 1;
        while (t2 > 0) {
            l *= t2;
            t2--;
        }

        return upper / (l * 2);

    }

    public static List<String> getLongestSubsequence(String[] w, int[] g) {
        List<String> ans = new ArrayList<>();


        for (int i = 1; i < w.length; i++) {
            if (g[i] != g[i - 1]) {
                String t = w[i];
                ans.add(t);
            }
        }

        return ans;
    }

    public static void moveZeroes(int[] arr) {
        int index = 0;
        int d = index + 1;

        //logic
        while (d < arr.length) {

            while (arr[index] != 0) {
                index++;
            }
            if (arr[d] != 0) {
                arr[index] = arr[d];
                arr[d] = 0;
            } else {
                if (d == arr.length - 1) {
                    break;
                }
                d++;

            }
        }


        System.out.println(Arrays.toString(arr));
    }

    public static void pyramid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines :");
        int lines = scanner.nextInt();

        int start = 1, step = 1;

        while (lines > 0) {
            System.out.print(start + " ");
            int s = step;
            while (s > 0) {
                s--;
                System.out.print(++start + " ");
            }
            step++;
            lines--;
            start++;
            System.out.println();
        }
    }

    public static void star() {
        int n = 5;
        int step = 0;

        while (n > 0) {
            System.out.print("x ");

            for (int j = 0; j < step; j++) {
                System.out.print("x ");
            }
            step++;
            System.out.println();
            n--;
        }
    }

    public static void invertedStar() {
        int lines = 5;

        while (lines > 0) {
            for (int i = 0; i < lines; i++) {
                System.out.print("* ");
            }
            System.out.println();
            lines--;
        }
    }

    public static void ppyramid() {
        int n = 5;
        int step = 1;
        int count = 0;
        while (step <= n) {
            for (int i = 0; i < n - step; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < step; i++) {
                System.out.print(++count + " ");
            }
            step++;
            System.out.println();
        }

    }

    public static void inversePyramid() {
        int n = 5;
        int step = 0;
        while (n > 0) {
            for (int i = 0; i < step; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("x ");
            }
            n--;
            System.out.println();
            step++;
        }
    }

    public static void box() {
        int n = 12;
        int count = n;

        //first line
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        //middle logic
        while (count > 2) {
            System.out.print("*");
            for (int i = 0; i < (n - 2) * 2 + 1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            count--;
        }

        //last line
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }

    public static void diamond() {
        int n = 5;

    }

    public static boolean validMountainArray(int[] arr) {

        int n = arr.length;
        int peakindex = 0;
        int peak = 0;
        for (int i = 1; i < n - 1; i++) {

            if (arr[i] == arr[i - 1]) {
                return false;
            }


            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                peak = arr[i];
                peakindex = i;
                if (peakindex == 0 || peakindex == n - 1) return false;

                break;
            }

        }

        for (int i = peakindex + 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //    public List<Integer> topK(int[] arr){
//        PriorityQueue<Integer> qu = new PriorityQueue<>();
//        char ch = 'x';
//        String temp = String.valueOf(ch);
//        String s = "sduss";
//        System.out.println(s.contains("sdu"));
//    }
    public static double findMaxAverage(int[] arr, int k) {
        if (arr.length < 2) {
            return (double) arr[0];
        }
        int curr = 0;
        int max = 0;


        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }
        max = curr;
        int index = 0;
        for (int i = k; i < arr.length; i++) {
            curr -= arr[index];
            curr = curr + arr[i];
            max = Math.max(curr, max);
            index++;
        }

        return (double) max / 4;
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {
        int l = 1, r = 1;
        int curr = Integer.MIN_VALUE;
        int index = -1;
        int[] ans = new int[arr.length - k + 1];


        for (int i = 0; i < k; i++) {
            if (arr[i] > curr) {
                curr = arr[i];
            }
        }

        arr[++index] = curr;
        curr = Integer.MIN_VALUE;

        while (l + k < arr.length) {

            if (r == k) {
                curr = Integer.MIN_VALUE;
                r = 1;
            }

            for (int i = l; i < l + k; i++) {
                if (arr[i] > curr) {
                    curr = arr[i];
                }
            }

            l++;
            r++;
            ans[++index] = curr;
        }
        return ans;
    }

    public static int longestPalindrome(String[] words) {

        int count = 0;
        List<String> list = new ArrayList<>();


        for (String s : words) {

            if (s.charAt(0) == s.charAt(1)) {
                if (count > 4) {
                    count += 2;
                }
            }

            if (list.contains(s)) {
                count += 4;
                list.remove(s);
                continue;
            }
            String rev = "" + s.charAt(1) + s.charAt(0);
            if (list.contains(rev)) {
                count += 4;
                list.remove(rev);
                continue;
            }
            list.add(s);
        }
        return count;
    }

    public static int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                    if (sum > max) max = sum;
                }
            }
        }
        return max;
    }

    public static int numRescueBoats(int[] arr, int limit) {
        int l = 0;
        int r = arr.length - 1;
        int count = 0;
        Arrays.sort(arr);
        while (l <= r) {

            while (arr[r] == limit) {
                count++;
                r--;
            }
            if (arr[l] + arr[r] <= limit) {
                count++;
            }
            l++;
            r--;
        }

        return count;
    }

    public static int adjacent(int[] arr) {


        int max = Math.abs(arr[0] - arr[arr.length - 1]);
        int d = max;
        for (int i = 1; i < arr.length; i++) {
            d = Math.abs(arr[i] - arr[i - 1]);
            if (d > max) {
                max = d;
            }
        }

        return d;
    }

    public static int MaxDifference(int num) {
        String s = String.valueOf(num);


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                s = s.replace(s.charAt(i), '9');
                break;
            }
        }
        int max = Integer.parseInt(s);
        s = String.valueOf(num);


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                s.replace(s.charAt(i), '0');
                break;
            }
        }

        int min = Integer.parseInt(s);

        return max - min;
    }

    public static int[] gen(int n) {
        int[] res = new int[n];
        if (n % 2 == 0) {
            int start = n / 2;
            start = -start;

            for (int i = 0; i < n; i++) {
                if (start == 0) {
                    start++;
                    i--;
                    continue;
                }
                res[i] = start;
                start++;
            }
        } else {
            int start = n / 2;
            start = -start;

            for (int i = 0; i < n; i++) {
                res[i] = start;
                start++;
            }
        }

        return res;
    }
}

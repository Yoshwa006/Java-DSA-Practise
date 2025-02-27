package OneFiftyInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        MergeSortedArray(new int[]{1,4,9,5,6,0,0,0}, 5, new int[]{2,5,6}, 3);

//        System.out.println(Arrays.toString(rotate_array(new int[]{1,2,3,8,9,7},3)));
//        System.out.println(isPalindrome(-121));
//        System.out.println(findPeakElement(new int[]{1,2,3,1}));
        //System.out.println(canConstruct("aa","ab"));
        System.out.println();
    }


    public static void MergeSortedArray(int[] nums1, int m, int[] nums2, int n ){
        if(n == 0){
            return ;
        }
        if(m == 0){
            return ;
        }
          int k=0;
        for(int i=m; i<=nums1.length-1; i++){
            nums1[i] = nums2[k];
            k++;
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static int[] rotate_array(int[] arr, int k){
        int[] f = new int[arr.length];
        Arrays.fill(f,-1);
        int n = arr.length-1;
        int in=0;
        for(int i =n; i>=k; i--){
            f[in++] = arr[i];
        }

for(int i=k; i<n-k; i++){
    f[i] = arr[i];
}
        return f;
    }
    public static boolean isPalindrome(int x) {
        int y =x;
        int res=0,rem;

        while(x!=0){
            rem = x%10;
            res = (res *10) +rem;
            x/=10;
        }

        return y == res;
    }
    public static int findPeakElement(int[] arr) {
        int l =0;
        int r= arr.length -1;
        int m = (l+r)/2;
        while(l<=r){
            if(arr[m] > arr[m-1] && arr[m] > arr[m+1]){
                return m;
            }
            else if(arr[m-1] > m){
                r =m;
            }
            else{
                l=m+1;
            }
            m= (l+r)/2;
        }

        return -1;
    }
    public static boolean canConstruct(String r, String m) {
        ArrayList<Character> set = new ArrayList<>();
        char[] ch = m.toCharArray();
        for(char c : ch){
            set.add(c);
        }

        for(int i=0; i<r.length(); i++){
            if(set.contains(r.charAt(i))){
                set.remove(i);
            }
        }
        return true;
    }

}

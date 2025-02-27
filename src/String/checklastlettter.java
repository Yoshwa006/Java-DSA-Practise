package String;

public class checklastlettter {

    public static void main(String[] args) {

        System.out.println(reverseOnlyLetters("ab-cd"));
    }
    public static void isPalindrome(String s) {
        String f = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(f);
        int l =0;
        int r = f.length()-1;
        boolean res = false;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){

            }
        }

    }

    public static int maxProfit(int[] arr) {
        int min = arr[0];
        int max= 0;
        for( int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else{
                max = arr[i] - min;
            }
        }

        return max;
    }
    public static String reverseOnlyLetters(String s) {
        int l =0;
        int r = s.length() -1;
        char[] ch = s.toCharArray();
        while(l<r){
            char lc = ch[l];
            while(!Character.isLetterOrDigit(lc)){
                l++;
            }
            char rc = ch[r];
            while(!Character.isLetterOrDigit(rc)){
                r--;
            }
            char temp =  ch[l];
            ch[l] = ch[r];
            ch[r] =temp;
            l++;
            r--;
        }
        StringBuilder f= new StringBuilder();

        return "hvy";
    }
    
}

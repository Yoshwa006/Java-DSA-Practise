package String;
import java.util.Arrays;
public class checklastlettter {

    public static void main(String[] args) {

//        System.out.println(reverseOnlyLetters("ab-cd"));
//        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));
//        System.out.println(skip5("seedfasasfafafafafaaaaaaarr"));
        System.out.println(firstUniqChar("loveleetcode"));
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
    public static String id (String str){


        StringBuilder ans = new StringBuilder();


        for(int i =0; i<str.length(); i++){
            int mul =0;
            StringBuilder ex = new StringBuilder();
            char ch = str.charAt(i);


            if(Character.isDigit(ch)){
                mul = ch - '0';
                i++;
            }

            if (str.charAt(i) == '[') {
                i++;
                while(str.charAt(i) != ']'){
                    ex.append(str.charAt(i));
                    i++;
                }
                ans.append(String.valueOf(ex).repeat(mul));
            }



        }

        return new String(ans);
    }
    public static boolean lemonadeChange(int[] arr) {
        int f = 0;
        int t =0;
       for( int num: arr){

           if(num== 5){
               f++;
           }

           if(num== 10){
               t++;
               if(f>0){
                   f--;
               }
               else{
                   return false;
               }
           }

            if(num == 20){
                if(t>0 && f>0){
                    t--;
                    f--;
                    continue;
                }
                else if(t==0 && f>3){
                    f = f-3;
                    continue;
                }
                else{
                    return false;
                }
            }

        }
        return true;
    }


    public static String skip5(String s){
       StringBuilder ans = new StringBuilder();
       for(int i =0; i<s.length(); i++){
           if(s.charAt(i) != 'a'){
               ans.append(s.charAt(i));
           }
       }

       return new String(ans);
    }

    public static int lengthOfLastWord(String s){
        String[] ans = s.split(" ");
        String buc = ans[s.length()-1];

        return buc.length();
    }
    public static int firstUniqChar(String s) {
        if(s.length() == 1){
            return s.charAt(0);
        }
        String ss = sort(s);
        if(ss.charAt(0) != ss.charAt(1)){
            return 0;
        }
        for(int i =1; i<s.length()-1; i++){
            if(ss.charAt(i) != ss.charAt(i-1) && ss.charAt(i) != ss.charAt(i+1)){
                return i;
            }
        }
        if(ss.charAt(ss.length() -1) != ss.charAt(ss.length() -2)){
            return ss.length()-1;
        }
        return -1;

    }

    public static String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        return new String(arr);
    }
}

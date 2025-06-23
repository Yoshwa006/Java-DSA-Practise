package String;

import java.util.ArrayList;
import java.util.HashSet;

public class SubString {
    public static void main(String[] args) {

//        System.out.println(countSubString("ababab", "ab"));
//        System.out.println(countNumofSub("abcdef", 3));
//        System.out.println(repeatedSubstringPattern("abac"));
//        Program("problem");
//        System.out.println(reverse("yoshwa"));
        System.out.println(fact(12));
    }



    public static boolean generate(String s){


        ArrayList<String> list = new ArrayList<>();
        for( int i=0;i <s.length(); i++){
            for( int j = i+1; j<=s.length(); j++){
                list.add(s.substring(i,j));
                if(list.contains("hell")){
                    return  true;
                }
            }
        }

        System.out.println(list );

        return false;
    }

    public static int countSubString(String s,String sub){
            int count = 0;
            for (int i = 0; i <= s.length() - sub.length(); i++) {
                if (s.substring(i, i + sub.length()).equals(sub)) {
                    count++;
                }
            }
            return count;
        }



    public static ArrayList<String> countNumofSub(String s, int k){
        ArrayList<String> list = new ArrayList<>();


        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                if(s.substring(i,j).length() == k){
                    list.add(s.substring(i,j));
                }
            }
        }

        return list;
    }

    public static boolean repeatedSubstringPattern(String s) {
        HashSet<String> list = new HashSet<>();


        for( int i =0; i<s.length(); i++){
            for( int j=i+1; j<=s.length(); j++){
                String sub = s.substring(i,j);
                if(list.contains(sub)){
                    return true;
                }
                    list.add(sub);
            }
        }

        return false;
    }

    public static void Program(String s){
        int l =0;
        int n = s.length();
        int r = s.length() -1 ;

        while(l<n){
            for(int i = 0; i<n; i++){
                if(l == r){
                    for(int k = 0; k<n/2; k++){
                        System.out.print(" ");
                    }
                    System.out.print(s.charAt(l)  + " ");
                    break;
                }
                else if(i == l){
                    System.out.print(s.charAt(l)+ " ");
                }
                else if(i == r){
                    System.out.print(s.charAt(r)+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            l++;
            r--;
            System.out.println();
        }
    }
    public static String reverse(String s){
            if (s.length() <= 1) return s;
            return reverse(s.substring(1)) + s.charAt(0);
        }

        public static int fact(int n){
        if(n <=1){
            return 1;
        }
        return n * fact(n-1);
        }

}

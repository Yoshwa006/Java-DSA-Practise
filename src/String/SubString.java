package String;

import java.util.ArrayList;
import java.util.HashSet;

public class SubString {
    public static void main(String[] args) {

//        System.out.println(countSubString("ababab", "ab"));
//        System.out.println(countNumofSub("abcdef", 3));
        System.out.println(repeatedSubstringPattern("abac"));
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
}

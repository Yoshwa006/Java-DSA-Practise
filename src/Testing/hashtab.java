package Testing;

import java.util.HashMap;
import java.util.Hashtable;

public class hashtab {
    public static void main(String[] args) {
        Hashtable<String, String> list= new Hashtable<>();
        System.out.println(work("abba", "dog cat cat dog"));
    }

    public static boolean work(String pattern, String s){
        char[] ch = pattern.toCharArray();
        String[] arr = s.split(" ");
        HashMap<Character, String>list =new HashMap<>();
        if(ch.length != arr.length){
            return false;
        }
        else{
            for (int i=0; i<ch.length; i++){
                list.putIfAbsent(ch[i] , arr[i]);

                if(arr[i] != (list.get(ch[i]))){
                    return false;
                }
            }
        }

        return true;
    }
}

package Maps;

import java.util.*;


public class Main {

    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "h");
        map.put(2, "he");
        map.put(3, "hel");
        map.put(4, "hell");
        map.put(5, "hello");
        map.put(6, "hello world");

        for(int i=1 ; i<= map.size(); i++){
            if(map.get(i).equals("hell")){
                System.out.println(i);
                break;
            }
        }
    }
}

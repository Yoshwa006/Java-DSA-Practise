package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();

        ans = permute("ABA");
        System.out.println(ans);
    }


    public static List<String> permute(String s){
        boolean[] visit = new boolean[s.length()];
        List<String> result =new ArrayList<>();
        backtrack(s,"", visit, result);
        return result;
    }

    public static void backtrack(String s, String curr, boolean[] visit, List<String> result){
       if(curr.length() == s.length()){
            result.add(curr);
        }

        for(int i =0; i<s.length(); i++){
            if(visit[i]){
                continue;
            }
            visit[i] = true;
            backtrack(s,curr+s.charAt(i),visit,result);
            visit[i] =false;
        }
    }
}

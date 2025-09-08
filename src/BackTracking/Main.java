package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();

        ans = permute("ABA");
        System.out.println(ans);
        System.out.println(subsets(new int[]{1,2,3}));
    }


    public static List<String> permute(String s){
        boolean[] visit = new boolean[s.length()];
        List<String> result =new ArrayList<>();
        ABCbacktrack(s,"", visit, result);
        return result;

    }

    public static void ABCbacktrack(String s, String curr, boolean[] visit, List<String> result){
       if(curr.length() == s.length()){
            result.add(curr);
        }

        for(int i =0; i<s.length(); i++){
            if(visit[i]){
                continue;
            }
            visit[i] = true;
            ABCbacktrack(s,curr+s.charAt(i),visit,result);
            visit[i] =false;
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ABCbacktrack(0, nums, new ArrayList<>(), result) ;
        result.remove(0);
        return result;
    }

    private static void ABCbacktrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Add the current subset

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); // Include
            ABCbacktrack(i + 1, nums, current, result); // Recurse
            current.remove(0); // Backtrack
        }
    }

}

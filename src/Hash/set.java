package Hash;

import Testing_Garbages.LIst;

import javax.swing.*;
import java.util.*;;

public class set {
    public static void main(String[] args) {
//frequencySort(new int[]{1,1,1,2,2,2,2,3,4,4,4,5,6,5,5,5,6,6,6,7,7,8,3,4,6,});

        System.out.println(anagram("ABC", "ACB"));
    }


    public static void topk(int[] arr) {
        HashSet<Integer> set = new HashSet<>();   // Key, Value


        for( int num :arr ){
            set.add(num);
        }


    }
    public static void frequencySort(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Loop through the array to populate the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list of map entries and sort it by values
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        // Extract sorted keys into an array
        int[] sortedKeys = new int[entryList.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedKeys[index++] = entry.getKey();
        }



    }



    public static int CountAfterOperations(String s){
        int n =s.length();
        int count =0;
        List<Character> list = new ArrayList<>();
        List<Character> set = new ArrayList<>();


        for(int i =0; i<n;i++){
            list.add(s.charAt(i));
        }



        for(int i =0; i<n; i++){
            if(!set.isEmpty() && set.contains(s.charAt(i))){
                for(int k = i+1; k<n; i++){
                    if(list.contains(s.charAt(i))){
                        list.remove(k);
                        set.remove(s.charAt(i));
                    }
                }
            }


            else{
                set.add(s.charAt(i));
                count++;
            }
        }

        return count;
    }


    public static void doubleList(){
        List<List<Integer>> list = new ArrayList<>();


        list.add(new ArrayList<>(new ArrayList<>(Arrays.asList(1,2,3,4))));
        System.out.println(list.get(0).get(2));
    }

    public static void learningMap(){
        HashMap<Integer, Integer> map = new HashMap<>();


        int[] arr = {2,3,4,5,6,7,8,2,3,3,3,8};
        int i =-1;
        for (int num : arr) {
            map.put(++i, arr[i]);
        }
        HashMap<String,Integer> map1 = new HashMap<>();

        map1.put("apple",1);
        map1.put("mango",2);
        map1.put("orange",3);
//        System.out.println(map1);


//        System.out.println(map1.getOrDefault("apple",45));
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
             freq.put(   num,        map.getOrDefault(num , 0) +1      );
        }
        System.out.println(freq);
    }

    public static boolean anagram(String s, String t){

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> ma = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Subtract frequencies using `t`
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) return false; // If a char is missing, return false
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) map.remove(ch); // Remove if frequency reaches zero
        }

        // If map is empty, the strings are anagrams
        return map.isEmpty();
    }
}

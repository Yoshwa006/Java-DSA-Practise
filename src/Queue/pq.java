package Queue;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class pq {
    public static void main(String[] args) {

        int[] arr = {8,4,4};
        System.out.println(stonesum(arr));
    }

    public static void pq(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();


        int[] arr = {1,5,3,2,56,8,5,3,2,4,6,21,4,6,8,};

        for(int num: arr){
            queue.add(num);
        }
        int [] arra  = new int[queue.size()];
        int i=0;
       while(!queue.isEmpty()){
           arra[i]= queue.poll();
           i++;
       }

        System.out.println(Arrays.toString(arra));
    }


    public static int[] kthsmallest(int[] arr, int k){
        PriorityQueue<Integer> q =new PriorityQueue<>(Collections.reverseOrder());

        for( int num :arr){
            q.add(num);
        }


        int[] f = new int[k];
        int i=0;
        while(i!=k && !q.isEmpty()){
            f[i] = q.poll();
            i++;
        }
        return f;
    }


    public static int[] ksortedarray(int[] arr1, int[] arr2, int[] arr3){

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for( int num :arr1){
            q.add(num);
        }

        for(int num : arr2){
            q.add(num);
        }

        for( int num : arr3){
            q.add(num);
        }

        int[] f = new int[q.size()];
        int i=0;

        while(!q.isEmpty()){
            f[i] = q.poll();
            i++;
        }
        return f;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            heap.add(num);
        }

        while(!heap.isEmpty()){
            int n = heap.poll();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }


    Map<Integer, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue()) // Sort by values
            .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue,
                    LinkedHashMap::new // To maintain insertion order
            ));

    Integer[] f = map.values()
            .stream()
            .limit(k)
            .toArray(Integer[]::new);
    int[] fi = new int[k];
    for(int m =0; m <k; m++){
        fi[m] = f[m];
    }

    return fi;
}

    public void kthLargestNumber(String[] nums, int k) {
//        PriorityQueue<BigInteger> q = new PriorityQueue<>((Collections.reverseOrder()));  // Explicitly min-heap using compa
//
//
//
//        BigInteger[] arr = new BigInteger[nums.length];
//        for(int i =0; i< nums.length; i++){
//            arr[i] = BigInteger.valueOf(nums[i]);
//        }
//
//
//        for( int num : arr){
//            q.add(num);
//        }
//
//        int f =0;
//        while(!q.isEmpty() && k>0){
//            f = q.poll();
//            k--;
//        }
//
//        return String.valueOf(f);
    }
    //[1,3,2,1,7,0,0,6,9,1]
    public static int[] finalPrices(int[] arr) {
        for(int i =0; i<arr.length-1; i++){
            for( int j = i+1; j<arr.length; j++){
                if(arr[j] <= arr[i]){
                    arr[i] = arr[i] - arr[j];
                    break;
                }
            }
        }

        return arr;
    }
    public static int findDuplicate(int[] arr) {
        for(int i =0; i< arr.length-1; i++){
            for( int j=i+1; i< arr.length-1; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }

        return -1;
    }


    public static int stonesum(int[] arr){
        PriorityQueue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());

        for(int num : arr){
            qu.add(num);
        }


        while(!qu.isEmpty()){
            if(qu.size() == 1){
                return qu.poll();
            }

            int a = qu.poll();
            int b = qu.poll();

            int diff = a-b;

            if(diff>0){
                qu.add(diff);
            }
        }

        return 0;
    }
}

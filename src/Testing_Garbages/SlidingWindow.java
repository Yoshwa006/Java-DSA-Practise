package Testing_Garbages;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,-2,4,2,6,-4,9,-4,5,3};
        System.out.println(sw(arr,3));
    }

    public static int sw(int[] arr,int k){
        int curr = 0, max =0;
        int start =0, end =0;

        for(end =0; end < arr.length; end++){
            curr += arr[end];

            if(end >= k-1){
                max = Math.max(curr,max);
                curr-= arr[start];
                start ++;
            }
        }
        return  max;
    }
}

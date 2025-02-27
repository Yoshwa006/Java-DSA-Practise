package Algorithms;

public class TwoPointer {
    public static void main(String[] args) {

        int []arr = {45, 12, 89, 33, 7, 67, 21,56, 58, 92, 36, 14, 73, 50, 8, 27};

        System.out.println(find(arr,56));
    }
    public static void reverse(String name){


        char [] ch = name.toCharArray();

        int left = 0;
        int right = ch.length -1;

        while(left <= right ){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String str = new String(ch);
        System.out.println(str);
    }
    public static int find(int [] arr, int target){
        int n= arr.length;
        int left =0;
        int right =arr.length -1;

        while(left < right){
            if(arr[left] == target){
                return left;
            } else if (arr[right] == target) {
                return right;
            }
            left ++;
            right --;
        }
        return -1;
    }

//    public static int[] Threesome(int[] arr, int target){
//        int l =0;
//        int r =arr.length-1;
//        int m = (l+r)/2;
//
//        while(l<r){
//            int temp = arr[l] + arr[r] + arr[m];
//            if(temp == target){
//                return new int[]{l,m,r};
//            }
//            else if(temp < target){
//                m++;
//            }
//        }
    }


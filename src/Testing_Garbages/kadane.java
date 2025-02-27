package Testing_Garbages;

public class kadane {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(run(arr));
    }

    public  static int run(int[] arr){
        int n = arr.length;
        int current =0;
        int max = 0;

        for(int m : arr){
            current += m;

            if(current > max){
                max = current;
            }
            if(current < 0){
                current =0;
            }
        }

        return max;
    }
}

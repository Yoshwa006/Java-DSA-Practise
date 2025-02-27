package LeetCode;

public class ItemBeauty {
    public static void main(String[] args) {
        int[][] items = {{1,2}, {3,2},{2,6},{2,9},{5,6},{3,5}};

        String sentence = "i love burger";
        String search = "burger";
        System.out.println(isPrefixOfWord(sentence,search));
    }

    static public void sum(int[][] arr, int query){
        int n = arr.length -1;;
        int count = 0;

        for(int i=0; i< n; i++){
            if(arr[i][0] <= query){
                if(count < arr[i][1]){
                    count= arr[i][1];
                }
            }
        }
        System.out.println(count);
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String sen[] = sentence.split(" ");

        for(int i =0; i< sen.length; i++){
            if(sen[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return 1;
    }
}

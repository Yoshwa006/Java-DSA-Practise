package Stack;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        StackP s = new StackP(10);
        s.push(23);
        s.push(45);
        System.out.println(s.pop());
        s.print();
    }

    public static int ramp(int [] arr){
            Stack<Integer> st = new Stack<>();

            for( int num : arr){
                st.push(num);
            }
            int x=0, y=Integer.MAX_VALUE;
            while(!st.isEmpty()){
                int n = st.pop();
                if(x<n){
                    x=n;
                }
                if(n<y){
                    y =n;
                }
            }
            return x -y;
        }
    }

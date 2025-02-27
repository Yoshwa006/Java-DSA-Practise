package LinkedList.Practise.Problems;

import javax.print.DocFlavor;
import java.util.LinkedList;

public class Identical1 {
    public static void main(String[] args) {
        push();
    }
    static LinkedList<Integer> list1 = new LinkedList<>();
    static LinkedList<Integer> list2 = new LinkedList<>();

    static void push() {
        list1.add(8);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        Boolean n = identical1(list1,list2);
        System.out.println(n);
    }

    static boolean identical1(LinkedList list1, LinkedList list2){
        if(list1.size() != list2.size()){
            return false;
        }
        for(int i =0; i<list1.size(); i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }

}

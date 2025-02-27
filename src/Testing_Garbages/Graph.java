package Testing_Garbages;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Graph {
   int vertices;
   List<List<Integer>> list;

   Graph(int vertices){
       this.vertices = vertices;
       list = (new ArrayList<>());

       for (int i=0 ;i <vertices; i++){
           list.add(new ArrayList<>());
       }
   }

   void addEdge(int from, int to){
       list.get(from).add(to);
   }

   void printing(){
       for(int i=0; i<vertices; i++){
           System.out.print("Vertice - " +i + ": ");
           for(int ele : list.get(i)){
               System.out.print(ele + " ");
           }
           System.out.println();
       }
   }
}

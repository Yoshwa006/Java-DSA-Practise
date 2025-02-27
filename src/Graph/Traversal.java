package Graph;

import java.util.*;

public class Traversal {

    public static void main(String[] args) {
        int n = 6; // Number of nodes (Example)
        List<List<Integer>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Sample edges (Undirected Graph)
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(3);
        graph.get(4).add(5);
        graph.get(5).add(4);

        boolean[] visited = new boolean[n];
        
//        System.out.println("BFS Traversal:");
//        bfs(graph, 0, visited);
//        Arrays.fill(visited, false);

        stackDFS(graph,0,visited);
    }

    static void bfs(List<List<Integer>> graph, int node, boolean[] visited) {
        Queue<Integer> qu = new LinkedList<>();

        qu.add(node);
        visited[node] = true;


        while (!qu.isEmpty()) {
            int curr = qu.poll();
            System.out.println(curr);


            for (int n : graph.get(curr)) {
                if (!visited[n]) {
                    qu.add(n);
                    visited[n] = true;
                }

            }
        }

    }

  static public void dfs(List<List<Integer>> graph, int node, boolean[] visited){
        visited[node] = true;
      System.out.println(node);

      for(int n : graph.get(node)){
          if(!visited[n]){
              dfs(graph,n,visited);
          }
      }
    }
    public static void stackDFS(List<List<Integer>> list, int node, boolean[] visit){
        Arrays.fill(visit,false);
        Stack<Integer> st = new Stack<>();

        st.push(node);

        while(!st.isEmpty()){
            int d = st.pop();
            visit[d] = true;
            System.out.println("data -> " + d);

            for(int num : list.get(d)){
                if(!visit[num]) {
                    st.push(num);
                }
            }
        }
    }
}

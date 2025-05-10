package Graph;
import java.util.*;
public class GraphDFS {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        int n = 5; // Number of nodes
         visited = new boolean[n]; // Track visited nodes

        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Add edges (undirected graph)
        graph.get(0).add(2);
        graph.get(2).add(0);
        graph.get(2).add(4);
        graph.get(2).add(1);
        graph.get(4).add(3);
        graph.get(1).add(2);
        graph.get(0).add(1);
        graph.get(1).add(0);


        System.out.println("DFS Traversal:");
        bfs(0); // Start DFS from node 0
    }

    static void dfs(int node) {
        // Mark the node as visited
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

     static void bfs(int node){
        Queue<Integer> qu = new LinkedList<>();

        Arrays.fill(visited,false);
        qu.add(node);
        visited[node] = true;

        while(!qu.isEmpty()){
            int d = qu.poll();
            System.out.println(d);
            for(int n : graph.get(d)){

                if(!visited[n]){
                    qu.add(n);
                    visited[n] = true;
                }

            }
        }
    }

}

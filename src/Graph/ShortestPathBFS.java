package Graph;

import java.util.*;

public class ShortestPathBFS {
    public static void findShortestPath(int n, List<List<Integer>> adj, int src, int dest) {
        int[] dist = new int[n]; // Distance array
        int[] parent = new int[n]; // To track the path
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        dist[src] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == dest) break; // Stop when destination is found

            for (int neighbor : adj.get(node)) {
                if (dist[neighbor] == Integer.MAX_VALUE) { // If not visited
                    dist[neighbor] = dist[node] + 1;
                    parent[neighbor] = node; // Store the path
                    queue.add(neighbor);
                }
            }
        }

        // If destination is unreachable
        if (dist[dest] == Integer.MAX_VALUE) {
            System.out.println("No path exists from " + src + " to " + dest);
            return;
        }

        // Reconstructing the path
        List<Integer> path = new ArrayList<>();
        for (int at = dest; at != -1; at = parent[at]) {
            path.add(at);
        }
        Collections.reverse(path);

        System.out.println("Shortest path from " + src + " to " + dest + ": " + path);
        System.out.println("Shortest distance: " + dist[dest]);
    }

    public static void main(String[] args) {
        int n = 7; // Number of nodes
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(0).add(6); adj.get(6).add(0);
        adj.get(6).add(4); adj.get(4).add(6);
        adj.get(1).add(2); adj.get(2).add(1);
        adj.get(1).add(3); adj.get(3).add(1);
        adj.get(2).add(4); adj.get(4).add(2);
        adj.get(3).add(5); adj.get(5).add(3);

        findShortestPath(n, adj, 0, 5); // Find shortest path from node 0 to 4
    }
}

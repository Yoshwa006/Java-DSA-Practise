package Testing_Garbages;

public class mainforgrpah {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(2,3);
        graph.addEdge(3,3);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(3,1);
        graph.addEdge(0,1);

        graph.printing();
    }
}

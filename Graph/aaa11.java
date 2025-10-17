import java.util.ArrayList;
public class aaa11 {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge> edges) {
        // Example graph
        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, -4));
        edges.add(new Edge(2, 3, 2));
        edges.add(new Edge(3, 4, 4));
        edges.add(new Edge(4, 1, -1));
    }
    static void bellmanFord(ArrayList<Edge> edges, int V, int src) {
        int[] dist = new int[V];
        for(int i=0;i<V;i++){
            if(i!=src){
            dist[i]= Integer.MAX_VALUE;
        }
    }

    for (int i = 0; i < V - 1; i++) {
        for (Edge e : edges) {
            int u=e.src;
            int v=e.dest;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                dist[v] = dist[u] + e.wt;
            }
        }
    }

    // Check for negative weight cycles
    for (Edge e : edges) {
        if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
            System.out.println("Negative weight cycle detected!");
            return;
        }
    }

    System.out.println("Shortest distances from source " + src + ":");
    for (int i = 0; i < V; i++) {
        System.out.println("To " + i + " = " + dist[i]);
    }
    }
    
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        bellmanFord(edges, V, 0);
    }
}

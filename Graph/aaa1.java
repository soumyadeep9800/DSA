//adjacency list graph implement with weight
import java.util.*;
public class aaa1 {
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

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }
    public static void main(String[] args) {
        int V =4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // print adjacency list with weights
        for (int i=0;i<V;i++){
            System.out.print("Adjacency "+ i +" -> ");
            for (Edge e : graph[i]){
                System.out.print("(" + e.dest + ", w=" + e.wt + ") ");
            }
            System.out.println();
        }
    }
}

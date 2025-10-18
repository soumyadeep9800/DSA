// Kosaraju's Algorithm

import java.util.ArrayList;
import java.util.Stack;

public class aaa14 {static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    static void topologicalSorting(ArrayList<Edge> graph[],int curr, boolean vis[], Stack<Integer> stack){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topologicalSorting(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    static void KosarajuAlgorithm(ArrayList<Edge> graph[], int V){
        //step 1
        boolean vis[]=new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<V;i++){
            if(!vis[i]){
                topologicalSorting(graph, i, vis, stack);
            }
        }

        // step 2
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false;
            transpose[i] = new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        //step 3
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if(!vis[curr]){
                dfs(transpose, vis, curr);
                System.out.println();
            }
        }
    }
    static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr){
        vis[curr] = true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (vis[e.dest]==false) {
                dfs(graph, vis, e.dest);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        KosarajuAlgorithm(graph, V);
    }
}

//BFS  in graph
import java.util.*;
public class aaa2 {
    public static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void BFS(ArrayList<Edge> graph[],int V){
        Queue<Integer> q =new LinkedList<>();
        boolean vis[]= new boolean[V];
        q.add(0);

        while(!q.isEmpty()){
            int cur=q.remove();
            if(vis[cur]==false){
                System.out.print(cur+" ");
                vis[cur]=true;

                for(int i=0;i<graph[cur].size();i++){
                    Edge e = graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        BFS(graph, V);
        System.out.println();
    }
}

// for disconnected graph
// import java.util.*;

// public class aaa2 {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     public static void createGraph(ArrayList<Edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));
//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));
//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));
//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));
//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));
//         graph[6].add(new Edge(6, 5));
//     }

//     public static void bfs(ArrayList<Edge>[] graph, int V) {
//         Queue<Integer> q = new LinkedList<>();
//         boolean[] vis = new boolean[V];

//         for (int start = 0; start < V; start++) {
//             if (!vis[start]) { // if not visited, start BFS from here
//                 q.add(start);

//                 while (!q.isEmpty()) {
//                     int cur = q.remove();

//                     if (!vis[cur]) {
//                         System.out.print(cur + " ");
//                         vis[cur] = true;

//                         for (Edge e : graph[cur]) {
//                             q.add(e.dest);
//                         }
//                     }
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int V = 7;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);

//         System.out.println("BFS traversal:");
//         bfs(graph, V);
//         System.out.println();
//     }
// }

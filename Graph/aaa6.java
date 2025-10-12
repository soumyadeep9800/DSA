
import java.util.*;

public class aaa6 {
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
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[2].add(new Edge(2, 3));
    }

    public static void BFS(ArrayList<Edge> graph[],int V){
        boolean vis[]=new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static boolean validPath(ArrayList<Edge> graph[],int V,int src,int dest1){
        boolean vis[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(src);

        while (!q.isEmpty()) {
            int curr=q.remove();
            if(vis[curr]==false){
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    if(e.dest==dest1) return true;
                    q.add(e.dest);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[]= new ArrayList[V];
        int src=0;
        int dest=3;
        createGraph(graph);
        BFS(graph, V);
        System.out.println();
        System.out.println(validPath(graph, V, src, dest));
    }
}

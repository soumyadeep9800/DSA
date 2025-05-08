//print ways to go endpoint rat can go 4 dir in block there is deadlocks
public class aaa4{
    public static void print(int sr,int sc,int er,int ec,String s,boolean[][] isVisited,int[][] maze){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        } 
        if(maze[sr][sc]==0)return;
        isVisited[sr][sc]=true;
        //go right
        print(sr, sc+1, er, ec, s+"R",isVisited,maze);
        //go down
        print(sr+1, sc, er, ec, s+"D",isVisited,maze);
        //go left
        print(sr, sc-1, er, ec, s+"L",isVisited,maze);
        //go down
        print(sr-1, sc, er, ec, s+"U",isVisited,maze);

        //backtracking
        isVisited[sr][sc]=false;
    }
    public static void main(String[] args) {
        int rows=4;
        int cols=3;
        int maze[][]={{1,1,1},
                      {1,0,1},
                      {1,1,1},
                      {1,1,1}};
        boolean isVisited[][]= new boolean[rows][cols];              
        print(0,0,rows-1,cols-1,"",isVisited,maze);
    }
}

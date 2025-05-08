//Rat in a maze only how much ways will print only can go right and down
public class aaa{
    public static int Maze(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downWays=Maze(sr+1, sc, er, ec);
        int rightWays=Maze(sr, sc+1, er, ec);
        int totalWays=downWays+rightWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int count=Maze(1,1,rows,cols);
        System.out.println(count);
    }
}
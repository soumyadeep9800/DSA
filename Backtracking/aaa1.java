//print ways to go endpoint go right and down
public class aaa1{
    public static void print(int sr,int sc,int er,int ec,String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        } 
        //go right
        print(sr, sc+1, er, ec, s+"R");
        //go down
        print(sr+1, sc, er, ec, s+"D");
    }
    public static void main(String[] args) {
        int rows=2;
        int cols=2;
        print(1,1,rows,cols,"");
    }
}

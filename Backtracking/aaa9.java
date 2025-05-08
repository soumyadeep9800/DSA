public class aaa9 {
    public static boolean isSafe(char [][]board,int row,int col){
        int n=board.length;
        //check row
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        //check coloum
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        //check North-east
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //check south-east
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        //check south-west
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        //check north-west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }
    public static void nqueen(char [][]board,int row){
        int n=board.length;
        if(n==row){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){ 
            board[row][j]='Q';
            nqueen(board, row+1);
            board[row][j]='x';//backtracking 
            } 
        }
    }
    public static void main(String[] args) {
        int n=4; 
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nqueen(board, 0);
    }
}

public class aaa10 {
    public static boolean helper(int arr[][],int row,int col,int num){
        int n=arr.length;
        if(arr[row][col]==n*n-1) return true;
        int i,j;
        //2 up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && arr[i][j]==num+1) return helper(arr, i, j, num+1);
        //2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && arr[i][j]==num+1) return helper(arr, i, j, num+1);
        //2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && arr[i][j]==num+1) return helper(arr, i, j, num+1);
        //2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && arr[i][j]==num+1) return helper(arr, i, j, num+1);
        // 2 right 1up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && arr[i][j]==num+1) return helper(arr, i, j, num+1);
        // 2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && arr[i][j]==num+1) return helper(arr, i, j, num+1);
        // 2 left 1up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && arr[i][j]==num+1) return helper(arr, i, j, num+1);
        // 2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && arr[i][j]==num+1) return helper(arr, i, j, num+1);
        return false;
    }
    public static boolean checkValidGride(int[][] arr){
        if(arr[0][0]!=0) return false;
        return helper(arr, 0, 0, 0);
    }
    public static void main(String[] args) {
        int arr[][]={{0,11,16,5,20},
                     {17,4,19,10,15},
                     {12,1,8,21,6},
                     {3,18,23,14,9},
                     {24,13,2,7,22}};
        System.out.println(checkValidGride(arr));             
    }
}

//in 2-D array find sum in specific region.
import java.util.*;
public  class XXX10 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }
    static void prefixSumArray(int arr[][]){
        //row
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]+=arr[i-1][j];
        }
    }
       //  coloum
       for(int i=0;i<arr.length;i++){
           for(int j=1;j<arr[i].length;j++){
           arr[i][j]+=arr[i][j-1];
        }
    }
}
    static int finalAnswer(int arr[][],int r1,int r2,int c1,int c2){
        prefixSumArray(arr);
        int sum=0,left=0,up=0,common=0;
        int totalsum=0;
        sum=arr[r2][c2];
        left=arr[r2][c1-1];
        up=arr[r1-1][c2];
        common=arr[r1-1][c1-1];
        totalsum=sum-up-left+common;
        return totalsum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter youe array size");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int arr[][]=new int[x][y];
        System.out.println("enter your array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
       System.out.println("Enter your range");
       int r1=sc.nextInt();
       int c1=sc.nextInt();
       int r2=sc.nextInt();
       int c2=sc.nextInt();
       System.out.println("your input array");
       printArray(arr);
       System.out.println();
       System.out.println("Final total sum");
       int eee=finalAnswer(arr, r1, r2, c1, c2);
       System.out.println(eee);
    }
}

//find middle row and coloum in 2-D array
import java.util.*;

public class XXX16 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }
    static void findMiddle(int arr[][],int x,int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if (i==x/2) {
                    System.out.print(arr[i][j]+" ");
                }
                if (j==y/2) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
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
       System.out.println("your input array");
       printArray(arr);
       System.out.println(); 
       System.out.println("middle--------------->");
       findMiddle(arr, x, y);
    }
}

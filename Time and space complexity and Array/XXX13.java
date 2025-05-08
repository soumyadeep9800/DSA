//find eleent above the secondary diagonal.
import java.util.*;

public class XXX13 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }
    static void finalElement(int arr[][],int x,int y){
    
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
               if (i+j<x-1) {
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
       System.out.println("final--->");
       finalElement(arr, x, y);
    }
}

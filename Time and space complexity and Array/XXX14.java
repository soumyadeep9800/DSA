import java.util.*;

public class XXX14 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
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
    }
}

// find maximum in 2-D matrix
import java.util.Scanner;

public class XXX12 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }

    static int findMaximum(int arr[][]){
        int maximum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            if (maximum<arr[i][j]) {
                maximum=arr[i][j];
            }
        }
    }
    return maximum;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter youe array size");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter your array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    } 
       System.out.println("your input array");
       printArray(arr);
       System.out.println();
       System.out.println("largest element is----->");
       int xxx=findMaximum(arr);
       System.out.println(xxx);
    }
}

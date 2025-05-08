// find the 1st peck element which is greter then left and right
import java.util.*;
public class XXX7 {
    static void printMyArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void findPeak(int arr[]){
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            if (arr[i-1]<arr[i]&&arr[i+1]<arr[i]) {
             System.out.println(arr[i]);
             return;
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter size");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter array");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your input array");
        printMyArray(arr);  
        System.out.println();
        System.out.println("peak element");

       findPeak(arr);
    }
}

//even index number sum
import java.util.*;
public class XXX8 {
    static void printMyArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void evenIndex(int arr[]){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if (i%2==0) {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
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
        System.out.println("even index sum:---");
        evenIndex(arr);
    }
}

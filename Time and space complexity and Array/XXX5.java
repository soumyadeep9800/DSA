//finad maximum element in array.
import java.util.*;
public class XXX5 {
    static void printMyArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void findMaximum(int arr[]){
        int Max=Integer.MIN_VALUE;
        for(int element:arr){
            if (element>Max) {
               Max=element;
            }
        }
        System.out.println(Max);
    }
      
    
    public static void main(String[] args) {
        System.out.println("Enter your size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printMyArray(arr);
        System.out.println();
        System.out.println("i found maximum");
      
        findMaximum(arr);
    }
}

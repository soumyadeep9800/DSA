//input array and find even number and print
import java.util.*;
public class XXX4 {
    static void printMyArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
        System.out.println("your all even element");
        for(int element:arr){
        if (element%2==0) {
            System.out.print(element+" ");
        }
        }
    }
}

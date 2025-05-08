// revers array.
import java.util.*;
public class XXX1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter array");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x/2;i++){
            int temp=arr[i];
            arr[i]=arr[x-i-1];
            arr[x-i-1]=temp;
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

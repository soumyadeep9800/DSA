//check given array is palindrom or not.
import java.util.*;
public class XXX{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array size");
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter your array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        int flag=0;
        for(int i=0;i<x/2;i++){
            if (arr[i]!=arr[x-i-1]) {
                flag=1;
                System.out.println("not a palindrom");
                break;
            }
        }
        if (flag==0) {
            System.out.println("palindrpomic array");
        }
    }
}
//duplicat element
import java.util.*;
public class XXX2 {
    static void printMyArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void findDuplicat(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printMyArray(arr);
        System.out.println();
        System.out.println("Duplicat number is --");
        findDuplicat(arr);

    }
}

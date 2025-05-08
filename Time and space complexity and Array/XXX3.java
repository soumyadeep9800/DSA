//missing element
import java.util.*;
public class XXX3 {
    static void printMyArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int sumOfGivenArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printMyArray(arr);
        System.out.println(); 
        System.out.println("Given array sum");
        int www=sumOfGivenArray(arr);
        System.out.println(www);
        int x=n+1;
        int naturalNumberSum=x*(x+1)/2;
        System.out.println("Natural number sum");
        System.out.println(naturalNumberSum);
        int z=(naturalNumberSum-www);
        System.out.println("Missing element: "+z);
    }
}

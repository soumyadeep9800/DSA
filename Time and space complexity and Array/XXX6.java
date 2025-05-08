//find 2nd maximum in array

import java.util.*;
public class XXX6 {
    static void printMyArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int findMaximum(int arr[]){
        int Max=Integer.MIN_VALUE;
        for(int element:arr){
            if (element>Max) {
               Max=element;
               
            }
        }
      return Max;
    }
    static int findSecondMaximum(int arr[]){
            int max=findMaximum(arr);
            for(int i=0;i<arr.length;i++){
               if (arr[i]==max) {
                   arr[i]=Integer.MIN_VALUE;
               }
            }
            int findSecondMaximum=findMaximum(arr);
            return findSecondMaximum;
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
        System.out.println("your array");
        printMyArray(arr);
        System.out.println(); 
        System.out.println("i found second maximum");
      
       int xxx=findSecondMaximum(arr);
       System.out.println(xxx);
    }
}

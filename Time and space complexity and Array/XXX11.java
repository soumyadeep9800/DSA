//user input a matrix i found odd, even,0,posative,negative.

import java.util.*;
public class XXX11 {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }

    static int fundZero(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
           if (arr[i][j]==0) {
               count++;
           }
        }
    }
    return count;
}

static int fundEven(int arr[][]){
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
       if (arr[i][j]%2==0) {
           count++;
       }
    }
}
return count;
}

static int fundOdd(int arr[][]){
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
       if (arr[i][j]%2!=0) {
           count++;
       }
    }
}
return count;
}

static int fundPosative(int arr[][]){
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
       if (arr[i][j]>0) {
           count++;
       }
    }
}
return count;
}

static int fundNegative(int arr[][]){
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
       if (arr[i][j]<0) {
           count++;
       }
    }
}
return count;
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
       int zero=fundZero(arr);
       System.out.println("number of 0 = "+zero);
       int even=fundEven(arr);
       System.out.println("number of even = "+even);
       int odd=fundOdd(arr);
       System.out.println("number of odd = "+odd);
       int posative=fundPosative(arr);
       System.out.println("number of posative = "+posative);
       int negative=fundNegative(arr);
       System.out.println("number of negative = "+negative);
    }
}

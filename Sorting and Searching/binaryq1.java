//fast nad last occurences

import java.util.ArrayList;

public class binaryq1 {
    static int findIndex(int arr[],int x,int n){
        int st=0,end=n-1;
        int result=-1;
        while (st<=end) {
            int mid=st+(end-st)/2;
            if (x==arr[mid]) {
                result=mid;
                end=mid-1;//for 1st occurences
               // st=mid+1; // for last occurences
            }else if(x<arr[mid]){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
       int arr[]={1,2,2,5,5,5,5,5,6,6,6,6};
       int n=arr.length;
       int x=5;
       System.out.println(findIndex(arr, x, n)); 
    }
}

//2-D array.......
// 90 degree rotation of this array
import java.util.*;
public class XXX9 {
    static void printMatrix(int arr[][]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
        }
    }

    static void reversRow(int arr[]){
        int i=0,j=arr.length-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }  
    }

    static void rotatMatrix(int arr[][]){
        transposeMatrix(arr);
        for(int i=0;i<arr.length;i++){
            reversRow(arr[i]);
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter your row and coloum number");
       int r=sc.nextInt();
       int c=sc.nextInt();
       int arr[][]=new int[r][c];
       System.out.println("Enter your element");
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
             arr[i][j]=sc.nextInt();
        }
       }
       System.out.println("your input array");
       printMatrix(arr);
       System.out.println();
       System.out.println("rotat matrix");
       rotatMatrix(arr);
       printMatrix(arr);
    }
}

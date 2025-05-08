//twosum normal solution
import java.util.*;
public class xxx6 {
    public static void main(String[] args) {
        int arr[]={14,7,10,4,5,9,1,2};
         // Arrays.sort(arr);
        // System.out.println(arr[5]);
        int target=13;
        int indx1=-1;
        int indx2=-1;
        for(int i=0;i<arr.length-1;i++){
            int req=target-arr[i];
            for(int j=i+1;j<arr.length;j++){
                if (req==arr[j]) {
                    indx1=i;
                    indx2=j;
                    break;
                }
            }
            if(indx1!=-1)break;
        }
        if (indx1!=-1&&indx2!=-1) {
            System.out.printf("Indices: %d and %d\n",indx1,indx2);
        }else{
            System.out.println(-1);
        }
    }
}

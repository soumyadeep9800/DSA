//first negetive in each window of size k 
//H.W - silve this q using array only next time
import java.util.*;
public class xxx11 {
    public static void main(String[] args) {
        int arr[]={12,-1,-7,8,-15,30,16,28};
        int k=3;
        int n=arr.length;
        int temp[]=new int[n-k+1];
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            if (arr[i]<0) {
                q.add(i);
            }
        }
        for(int i=0;i<n-k+1;i++){
            if (q.size()>0 && q.peek()<i) {
                q.remove();
            }
            if (q.size()>0 && q.peek()<=i+k-1) {
                temp[i]=arr[q.peek()];
            }else{
                temp[i]=0;
            }
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}

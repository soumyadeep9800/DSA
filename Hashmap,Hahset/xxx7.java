//twosum
import java.util.*;
public class xxx7 {
    public static void main(String[] args) {
        int arr[]={14,7,10,4,5,9,1,2};
        int target=13;
        int ans[]={-1};
        HashMap<Integer,Integer> ht=new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            int req=target-arr[i];
            if (ht.containsKey(req)) {
                ans=new int[]{i,ht.get(req)};
                break;
            }else{
                ht.put(arr[i], i);
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}